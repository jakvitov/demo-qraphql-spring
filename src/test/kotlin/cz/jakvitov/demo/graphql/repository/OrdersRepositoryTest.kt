package cz.jakvitov.demo.graphql.repository

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Disabled
class OrdersRepositoryTest {

    @Autowired
    lateinit var repository: OrdersRepository

    @Test
    fun get_first_page_returns_orders() {
        val res = repository.getLatestOrders(20, 0)
        assert(res.isNotEmpty())
    }

}