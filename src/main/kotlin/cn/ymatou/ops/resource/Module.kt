package cn.ymatou.ops.resource

import com.avaje.ebean.EbeanServer
import com.google.inject.AbstractModule
import com.typesafe.config.Config
import cn.ymatou.ops.resource.provider.ConfigProvider
import cn.ymatou.ops.resource.provider.EbeanServerProvider


class Module : AbstractModule() {
    override fun configure() {
        bind(EbeanServer::class.java).toProvider(EbeanServerProvider::class.java).asEagerSingleton()
        bind(Config::class.java).toProvider(ConfigProvider::class.java).asEagerSingleton()
    }
}