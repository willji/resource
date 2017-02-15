package cn.ymatou.ops.resource

import java.util.concurrent.TimeUnit
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder

val channel = NettyChannelBuilder.forAddress("127.0.0.1", 50051).negotiationType(NegotiationType.PLAINTEXT).build()
val appStub = ResourceManagerGrpc.newBlockingStub(channel)

fun type_create() {
    val field1 = Field.newBuilder()
            .setName("name")
            .setDisplay("name")
            .setFieldType("STRING")
            .setIsRequired(true)
            .setIsUnique(true)
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .build()
    val field2 = Field.newBuilder()
            .setName("host")
            .setDisplay("host")
            .setFieldType("STRING")
            .setIsRequired(true)
            .setIsUnique(true)
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .setReferenceType("physicalserver")
            .setReferenceField("asset")
            .setConstraintCondition("multipletoone")
            .build()
    val field3 = Field.newBuilder()
            .setName("ipaddresses")
            .setDisplay("ipaddresses")
            .setFieldType("STRING")
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .setReferenceType("ipaddress")
            .setReferenceField("name")
            .setConstraintCondition("onetomultiple")
            .build()
    val request = Type.newBuilder()
            .setName("test")
            .setDescription("test")
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .addFields(field1)
//            .addFields(field2)
//            .addFields(field3)
            .build()

    try {
        val response = appStub.createType(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun type_delete() {
    val request = Type.newBuilder()
            .setName("physicalserver")
            .build()

    try {
        val response = appStub.deleteType(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun type_update() {
    val request = Type.newBuilder()
            .setName("ipaddress")
            .setDescription("ip")
            .setModifiedUser("jiwei")
            .build()

    try {
        val response = appStub.updateType(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun type_search() {
    val request = Type.newBuilder()
            .setName("ipaddress")
            .build()

    try {
        val response = appStub.searchType(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun field_create() {
    val request = Field.newBuilder()
            .setType("virtualmachine")
            .setName("description")
            .setDisplay("description")
            .setFieldType("STRING")
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
//            .setReferenceType("ipaddress")
//            .setReferenceField("ipaddress")
//            .setConstraintCondition("onetomultiple")
            .build()

    try {
        val response = appStub.createField(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun field_delete() {
    val request = Field.newBuilder()
            .setType("firewall")
            .setName("displayname")
            .build()

    try {
        val response = appStub.deleteField(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun field_update() {
    val request = Field.newBuilder()
            .setType("firewall")
            .setName("name")
            .setDisplay("11")
            .setIsRequired(true)
            .setIsUnique(true)
            .setIsMulti(false)
            .setDefaultValue("heheda")
            .setFieldType("STRING")
            .setModifiedUser("hehe")
//            .setReferenceType("ipaddress")
//            .setReferenceField("ipaddress")
//            .setConstraintCondition("onetomany")
            .build()

    try {
        val response = appStub.updateField(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun value_delete() {
    val request = Field.newBuilder()
            .setType("firewall")
            .setName("displayname")
            .build()

    try {
        val response = appStub.deleteValue(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun resource_create() {
    val value1 = Value.newBuilder()
            .setFiled("name")
            .setValue("test3")
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .build()
    val value2 = Value.newBuilder()
            .setFiled("host")
            .setValue("FW00001")
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .build()
    val value3 = Value.newBuilder()
            .setFiled("ipaddresses")
            .setValue("192.168.1.3")
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .build()

    val request = Resource.newBuilder()
            .setType("test")
            .setName("test3")
            .setIndexed(true)
            .setCreatedUser("jiwei")
            .setModifiedUser("jiwei")
            .addValues(value1)
//            .addValues(value2)
//            .addValues(value3)
            .build()

    try {
        val response = appStub.createResource(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun resource_delete() {
    val request = Resource.newBuilder()
            .setUuid("a0e52997-80e8-4352-864b-ad5287ce4af1")
            .build()

    try {
        val response = appStub.deleteResource(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun resource_update() {
    val value1 = Value.newBuilder()
            .setFiled("description")
            .setValue("test11")
            .setModifiedUser("jiwei")
            .build()

    val request = Resource.newBuilder()
            .setUuid("6fc4dce9-5be5-4ebf-9d37-3d7e57936578")
            .setName("vm-192.168.1.3")
            .setModifiedUser("jiwei")
            .setIndexed(true)
            .setDeleted(false)
            .addValues(value1)
            .build()
    try {
        val response = appStub.updateResource(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun resource_search() {
    val request = SearchRequest.newBuilder()
            .setQuery("test")
            .setPage(1)
            .setSize(10)
            .build()

    try {
        val response = appStub.searchResource(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun history_search() {
    val request = History.newBuilder()
            .setResource("a0eb2392-3d31-4672-bd96-ca29df73272b")
            .setField("ipaddress")
            .build()

    try {
        val response = appStub.searchHistory(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun task_search() {
    val request = Task.newBuilder()
            .setId(31)
            .build()

    try {
        val response = appStub.searchTask(request)
        println("response from server ${response}")
    }finally {
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS)
    }
}

fun main(args: Array<String>) {
    resource_search()
}

