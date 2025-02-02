package cz.jakvitov.demo.graphql.dto

import cz.jakvitov.demo.graphql.domain.Orders
import java.time.LocalDate

data class Order (val orderId: Long, val orderDate: LocalDate?){

    constructor(orders: Orders): this(orders.orderId, orders.orderDate)

}