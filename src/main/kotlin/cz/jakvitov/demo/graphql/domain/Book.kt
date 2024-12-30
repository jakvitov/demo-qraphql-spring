package cz.jakvitov.demo.graphql.domain

data class Book(val id: Long, val name: String, val authorId: Long, val genre: Genre) {
}

enum class Genre {
    COMIC,
    DETECTIVE,
    SCI_FI
}