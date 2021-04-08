package com.example.formatter

class FriendlyGreeting : GreetingFormatter {

    override fun greet(name: String): String {
        return "Hey $name! I'm so happy to see you! I'm always delighted when I see you. Seriously!"
    }
}
