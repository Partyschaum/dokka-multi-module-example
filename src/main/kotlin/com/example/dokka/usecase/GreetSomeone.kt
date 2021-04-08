package com.example.dokka.usecase

import com.example.formatter.GreetingFormatter

class GreetSomeone(
    private val formatter: GreetingFormatter,
) {

    data class Request(val name: String)

    data class Response(val greeting: String)

    operator fun invoke(request: Request): Response {
        return Response(
            greeting = formatter.greet(request.name)
        )
    }
}
