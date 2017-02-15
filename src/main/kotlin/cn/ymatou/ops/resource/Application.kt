package cn.ymatou.ops.resource

import com.google.inject.Guice
import com.typesafe.config.Config
import io.grpc.Server
import io.grpc.ServerBuilder
import io.grpc.ServerInterceptors
import org.avaje.agentloader.AgentLoader
import org.slf4j.LoggerFactory
import java.util.concurrent.Executors
import cn.ymatou.ops.resource.endpoint.ResourceEndpoint


class Application {
    private val logger = LoggerFactory.getLogger(javaClass)!!
    private val scheduler = Executors.newScheduledThreadPool(2)
    private var server: Server? = null
    private val injector = Guice.createInjector(Module())
    private val config = injector.getInstance(Config::class.java)
    private val port = config.getInt("server.port")
    private val accountEndpoint = injector.getInstance(ResourceEndpoint::class.java)

    private fun start() {
        server = ServerBuilder
                .forPort(port)
                .addService(ServerInterceptors.intercept(accountEndpoint))
                .build()
                .start()
        logger.info("Server started, listen on $port")
        Runtime.getRuntime().addShutdownHook(Thread({
            shutdown()
            logger.info("Server shutdown")
        }))
    }

    private fun shutdown() {
        server?.shutdown()
        scheduler.shutdown()
    }

    private fun blockUntilShutdown() {
        server?.awaitTermination()
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val logger = LoggerFactory.getLogger(Application::class.java)!!
            if (!AgentLoader.loadAgentFromClasspath("ebean-agent","debug=0;packages=cn.ymatou.ops.domain")) {
                logger.error("ebean-agent not found in classpath - not dynamically loaded")
            }
            val application = Application()
            println(application.port)
            application.start()
            application.blockUntilShutdown()
        }
    }
}
