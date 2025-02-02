package cz.jakvitov.demo.graphql.repository

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Disabled
class CustomersRepositoryTest {

    @Autowired
    lateinit var customersRepository: CustomersRepository

    @Test
    fun get_existing_customer_returs_value() {
        val id = 1L
        val res = customersRepository.findById(id)
        assert(res.isPresent)
    }

}