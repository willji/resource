package cn.ymatou.ops.resource.util

import io.grpc.Status

/**
 * Created by jiwei on 2016/12/22.
 */

object ExceptionFactory {
    fun notFound(msg: String) = Status.NOT_FOUND.withDescription(msg).asRuntimeException()!!

    fun validationFailed(msg: String) = Status.INTERNAL.withDescription(msg).asRuntimeException()!!

    fun unauthenticated(msg: String = "unauthenticated") = Status.UNAUTHENTICATED.withDescription(msg).asRuntimeException()!!

    fun permissionDenied(msg: String = "permission denied") = Status.PERMISSION_DENIED.withDescription(msg).asRuntimeException()!!

    fun unknown(e: Throwable) = Status.INTERNAL.withCause(e).asRuntimeException()!!
}