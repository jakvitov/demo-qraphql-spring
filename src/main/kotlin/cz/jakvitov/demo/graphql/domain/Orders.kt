package cz.jakvitov.demo.graphql.domain

import org.springframework.data.annotation.Id
import java.time.LocalDate

data class Orders(@Id val orderId: Long, val customerId: Long?, val orderDate: LocalDate?) {
}