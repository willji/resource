package cn.ymatou.ops.resource.service

/**
 * Created by jiwei on 2016/12/26.
 */
class PagedResponse<out T>(val page: Int, val size: Int, val pages: Int, val total: Int, val content: List<T>)