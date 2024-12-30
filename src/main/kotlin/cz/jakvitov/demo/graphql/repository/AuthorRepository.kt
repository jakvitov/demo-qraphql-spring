package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.Author
import org.springframework.stereotype.Repository

@Repository
class AuthorRepository {

    fun getAuthors(): List<Author> = listOf(Author(1L, "John", "Doe"),  Author(2L, "Max", "Musterman"))

    fun getAuthorById(id: Long): Author {
        return getAuthors().first {it.id == id}
    }
}