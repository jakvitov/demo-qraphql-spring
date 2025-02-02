package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.OrderDetails
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderDetailsRepository: CrudRepository<OrderDetails, Long> {
}