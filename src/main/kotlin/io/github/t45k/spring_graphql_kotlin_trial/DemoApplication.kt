package io.github.t45k.spring_graphql_kotlin_trial

import com.expediagroup.graphql.generator.scalars.ID
import com.expediagroup.graphql.server.operations.Query
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@Component
class UserQuery : Query {
    suspend fun findById(id: ID): User {
        return User(1)

    }
}

data class User(val id: Int)

@Component
@Aspect
class Aspect {
    @Before("execution(* io.github.t45k.spring_graphql_kotlin_trial.UserQuery.*(..))")
    fun before(joinPoint: JoinPoint): Any? {
        return null
    }
}
