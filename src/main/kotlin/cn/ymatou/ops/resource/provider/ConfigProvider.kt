package cn.ymatou.ops.resource.provider

import com.google.inject.Provider
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

/**
 * Created by jiwei on 2016/12/21.
 */

class ConfigProvider : Provider<Config> {
    override fun get(): Config {
        val profile = System.getProperty("profile") ?: "dev"
        return ConfigFactory.load("application.$profile.conf")
    }
}