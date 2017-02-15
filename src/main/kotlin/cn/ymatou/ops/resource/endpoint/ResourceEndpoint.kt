package cn.ymatou.ops.resource.endpoint

import org.slf4j.LoggerFactory
import com.google.inject.Inject
import cn.ymatou.ops.resource.*
import io.grpc.stub.StreamObserver
import com.google.inject.Singleton
import cn.ymatou.ops.resource.service.*
import cn.ymatou.ops.resource.util.ExceptionFactory


@Singleton
class ResourceEndpoint @Inject constructor(private val typeService: TypeService,
                                           private val resourceService: ResourceService,
                                           private val fieldService: FieldService,
                                           private val valueService: ValueService,
                                           private val historyService: HistoryService,
                                           private val taskService: TaskService
  ) :
                                            ResourceManagerGrpc.ResourceManagerImplBase() {
    private val logger = LoggerFactory.getLogger(javaClass)!!

    override fun createType(request: Type, responseObserver: StreamObserver<Type>) {
        try {
            val type = typeService.create(request)
            responseObserver.onNext(type)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("create type error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun deleteType(request: Type, responseObserver: StreamObserver<Type>) {
        try {
            val type = typeService.delete(request)
            responseObserver.onNext(type)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("delete type error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun updateType(request: Type, responseObserver: StreamObserver<Type>) {
        try {
            val type = typeService.update(request)
            responseObserver.onNext(type)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("update type error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun searchType(request: Type, responseObserver: StreamObserver<Type>) {
        try {
            val type = typeService.search(request)
            responseObserver.onNext(type)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("search type error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun createField(request: Field, responseObserver: StreamObserver<Field>) {
        try {
            val field = fieldService.create(request)
            responseObserver.onNext(field)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("create field error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun deleteField(request: Field, responseObserver: StreamObserver<Field>) {
        try {
            val field = fieldService.delete(request)
            responseObserver.onNext(field)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("delete field error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun updateField(request: Field, responseObserver: StreamObserver<Task>) {
        try {
            val response = fieldService.update(request)
            responseObserver.onNext(response)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("update field error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun deleteValue(request: Field, responseObserver: StreamObserver<Field>) {
        try {
            val field = valueService.delete(request)
            responseObserver.onNext(field)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("delete value error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun createResource(request: Resource, responseObserver: StreamObserver<Resource>) {
        try {
            val resource = resourceService.create(request)
            responseObserver.onNext(resource)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("create resource error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun deleteResource(request: Resource, responseObserver: StreamObserver<Resource>) {
        try {
            val resource = resourceService.delete(request)
            responseObserver.onNext(resource)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("delete resource error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun updateResource(request: Resource, responseObserver: StreamObserver<Resource>) {
        try {
            val resource = resourceService.update(request)
            responseObserver.onNext(resource)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("update resource error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun searchResource(request: SearchRequest, responseObserver: StreamObserver<PagedResourceResponse>) {
        try {
            val query = if (request.query.isEmpty()) "*" else request.query
            val page = if (request.page < 1) 1 else request.page
            val size = if (request.size < 50) 50 else request.size
            val result = resourceService.search(query, page, size)
            val res = PagedResourceResponse.newBuilder()
                    .setPageInfo(PageInfo.newBuilder()
                            .setPage(page)
                            .setPages(result.pages)
                            .setTotal(result.total)
                            .setSize(size)
                            .setHasNext(result.page < result.pages)
                            .setHasPrev(page > 1 && result.pages > 1)
                            .build())
                    .addAllResource(result.content)
                    .build()
            responseObserver.onNext(res)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("search Resource error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun searchHistory(request: History, responseObserver: StreamObserver<PagedHistoryResponse>) {
        try {
            val page = if (request.page < 1) 1 else request.page
            val size = if (request.size < 50) 50 else request.size
            val result = historyService.search(request.resource, request.field, page, size)
            val res = PagedHistoryResponse.newBuilder()
                    .setPageInfo(PageInfo.newBuilder()
                            .setPage(page)
                            .setPages(result.pages)
                            .setTotal(result.total)
                            .setSize(size)
                            .setHasNext(result.page < result.pages)
                            .setHasPrev(page > 1 && result.pages > 1)
                            .build())
                    .addAllHistory(result.content)
                    .build()
            responseObserver.onNext(res)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("search history error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }

    override fun searchTask(request: Task, responseObserver: StreamObserver<Task>) {
        try {
            val task = taskService.search(request)
            responseObserver.onNext(task)
            responseObserver.onCompleted()
        } catch (e: Exception) {
            logger.error("search task error", e)
            responseObserver.onError(ExceptionFactory.unknown(e))
        }
    }
}