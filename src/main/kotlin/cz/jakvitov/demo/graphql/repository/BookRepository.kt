package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.Author
import cz.jakvitov.demo.graphql.domain.Book
import org.springframework.stereotype.Repository

@Repository
class BookRepository {

    fun getAllBooks(): List<Book> {
        return listOf(Book(1L, "Book1", Author(1L, "John", "Doe")),
            Book(1L, "Book1", Author(2L, "Max", "Musterman")))
    }



}