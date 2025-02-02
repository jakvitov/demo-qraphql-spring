package cz.jakvitov.demo.graphql.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("categories")
data class Categories (@Id val categoryId: Long,  val name: String?, val description: String?){
}