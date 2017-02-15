package cn.ymatou.ops.resource.provider

import com.avaje.ebean.EbeanServer
import com.avaje.ebean.EbeanServerFactory
import com.avaje.ebean.config.ServerConfig
import com.google.inject.Provider
import java.util.*
import kotlin.jvm.javaClass

/**
 * Created by jiwei on 2016/12/21.
 */

class EbeanServerProvider : Provider<EbeanServer> {
    override fun get(): EbeanServer {
        val config = ServerConfig()
        val profile = System.getProperty("profile") ?: "dev"
        val props = Properties()
        props.load(javaClass.getResourceAsStream("/ebean.$profile.properties"))
        config.loadFromProperties(props)
        config.name = "default"
        config.isDefaultServer = true
        config.isRegister = true
        return EbeanServerFactory.create(config)
    }
}