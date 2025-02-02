package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.Categories
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoriesRepository: CrudRepository<Categories, Long> {
}