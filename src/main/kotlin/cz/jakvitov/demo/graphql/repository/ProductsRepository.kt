package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.Products
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductsRepository: CrudRepository<Products, Long> {
}