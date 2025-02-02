package cz.jakvitov.demo.graphql.dto

data class Customer (val id: Long, val name: String?,
    val contactName: String?, val address: String?,
    val city: String?, val postalCode: String?, val country: String? ){
}