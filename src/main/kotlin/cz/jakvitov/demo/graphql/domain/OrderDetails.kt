package cz.jakvitov.demo.graphql.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "order_details")
data class OrderDetails (@Id val orderDetailId: Long, val orderId: Long?, val productId: Long?, val quantity: Long?){

}