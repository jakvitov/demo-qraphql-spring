package cz.jakvitov.demo.graphql.controller

import cz.jakvitov.demo.graphql.domain.Customers
import cz.jakvitov.demo.graphql.domain.Orders
import cz.jakvitov.demo.graphql.repository.CustomersRepository
import cz.jakvitov.demo.graphql.repository.OrdersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.BatchMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class OrderController {

    @Autowired
    lateinit var ordersRepository: OrdersRepository

    @Autowired
    lateinit var customersRepository: CustomersRepository

    @QueryMapping
    fun latestOrders(@Argument page: Int, @Argument count: Int): List<Orders> {
        return ordersRepository.getLatestOrders(count, page * count)
    }

    //Fetching one by one in db
    //More effective way is often to fetch for the whole list to save up IO operations to db
    /*@SchemaMapping(typeName = "Order", field = "customer")
    fun getCustomerToOrder(orders: Orders): Customers? {
        return orders.customerId?.let { customersRepository.findById(it).orElse(null) }
    }*/

    //Fetching resources in batch saves the IO requests to DB
    @BatchMapping(typeName = "Order", field = "customer")
    fun getCustomersToOrders(orders: List<Orders>): Map<Orders, Customers> {
        val customers =  customersRepository.findAllById(orders.map { it.customerId })
        return orders.map { order -> Pair(order, customers.first {order.customerId == it.customerId}) }.toMap()
    }



}