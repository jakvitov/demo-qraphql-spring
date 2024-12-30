package cz.jakvitov.demo.graphql.repository

import cz.jakvitov.demo.graphql.domain.Author
import cz.jakvitov.demo.graphql.domain.Book
import cz.jakvitov.demo.graphql.domain.Genre
import org.springframework.stereotype.Repository

@Repository
class BookRepository {

    fun getAllBooks(): List<Book> {
        return listOf(Book(1L, "Book1",1, Genre.SCI_FI),
            Book(1L, "Book1", 2, Genre.COMIC    ))
    }

    fun getById(id: Long): Book {
        return getAllBooks().first { it.id == id }
    }

}