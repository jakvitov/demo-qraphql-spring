package cz.jakvitov.demo.graphql.domain

import org.springframework.data.relational.core.mapping.Table

@Table("customers")
class Customers(val customerId: Long, customerName: String?, contractName: String?, address: String?, city: String?,
                postalCode: String?, country: String?) {
}