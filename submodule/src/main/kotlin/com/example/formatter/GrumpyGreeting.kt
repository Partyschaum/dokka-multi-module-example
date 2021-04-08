package com.example.formatter

class GrumpyGreeting : GreetingFormatter {

    override fun greet(name: String): String {
        return "Oh no, it's you again. $name, I told you to stay away from me!"
    }
}
