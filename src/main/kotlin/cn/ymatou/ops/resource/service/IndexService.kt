package cn.ymatou.ops.resource.service

import com.avaje.ebean.EbeanServer
import com.google.inject.Inject
import com.google.inject.Singleton
import com.typesafe.config.Config
import org.apache.http.HttpHost
import org.apache.http.entity.ContentType
import org.apache.http.nio.entity.NFileEntity
import org.elasticsearch.client.RestClient
import java.io.File


@Singleton
class IndexService @Inject constructor(private val config: Config) {
    private val hosts = config.getConfigList("elasticsearch.hosts").map {
        HttpHost(it.getString("host"), it.getInt("port"), it.getString("schema"))
    }.toTypedArray()

    val client = RestClient.builder(*hosts).build()!!
}
