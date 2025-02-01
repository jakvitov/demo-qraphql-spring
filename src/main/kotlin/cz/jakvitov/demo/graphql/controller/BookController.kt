package cz.jakvitov.demo.graphql.controller

import cz.jakvitov.demo.graphql.domain.Author
import cz.jakvitov.demo.graphql.domain.Book
import cz.jakvitov.demo.graphql.repository.AuthorRepository
import cz.jakvitov.demo.graphql.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class BookController {

    @Autowired
    lateinit var bookRepository: BookRepository

    @Autowired
    lateinit var authorRepository: AuthorRepository

    @QueryMapping
    fun bookById(@Argument id: Long): Book {
        return bookRepository.getById(id)
    }

    @QueryMapping
    fun booksByName(@Argument name: String): List<Book> {
        return bookRepository.getAllBooks().filter { book -> book.name == name }
    }

    @SchemaMapping
    fun bookAuthor(book: Book): Author {
        return authorRepository.getAuthorById(book.authorId)
    }

}