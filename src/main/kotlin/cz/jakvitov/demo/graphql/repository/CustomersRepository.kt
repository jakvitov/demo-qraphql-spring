package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.Customers
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomersRepository: CrudRepository<Customers, Long> {
}