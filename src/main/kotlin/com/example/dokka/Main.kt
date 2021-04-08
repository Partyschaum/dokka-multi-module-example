package com.example.dokka

import com.example.dokka.usecase.GreetSomeone
import com.example.formatter.FriendlyGreeting

fun main() {
    val usecase = GreetSomeone(
        formatter = FriendlyGreeting()
    )

    val request = GreetSomeone.Request("Partyschaum")

    val response = usecase(request)

    println(response.greeting)
}
