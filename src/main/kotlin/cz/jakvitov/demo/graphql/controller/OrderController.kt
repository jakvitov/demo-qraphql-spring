package cz.jakvitov.demo.graphql.controller

import cz.jakvitov.demo.graphql.domain.Orders
import cz.jakvitov.demo.graphql.dto.Order
import cz.jakvitov.demo.graphql.repository.OrdersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class OrderController {

    @Autowired
    lateinit var ordersRepository: OrdersRepository

    @QueryMapping
    fun latestOrders(@Argument page: Int, @Argument count: Int): List<Order> {
        return ordersRepository.getLatestOrders(count, page * count).map { Order(it) }.toList()
    }

}