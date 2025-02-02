package cz.jakvitov.demo.graphql.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "products")
data class Products (@Id val productId: Long, val productName: String?, val categoryId: Long?, val unit: String?, val price: Double?, val pricingCode: String?) {
}