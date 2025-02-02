package cz.jakvitov.demo.graphql.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("customers")
data class Customers(@Id val customerId: Long, val customerName: String?, val contactName: String?, val address: String?, val city: String?,
                val postalCode: String?, val country: String?) {
}