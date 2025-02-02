package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.Orders
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrdersRepository: CrudRepository<Orders, Long> {

    @Query("select * from Orders order by order_date desc LIMIT :limit OFFSET :offset")
    fun getLatestOrders(limit: Int, offset: Int): List<Orders>

}