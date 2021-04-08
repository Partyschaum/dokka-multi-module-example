package com.example.formatter

/**
 * This is the friendly greeter
 *
 * Have a look this image
 *
 * ![hover text](/images/cloud_native.jpg)
 */
class FriendlyGreeting : GreetingFormatter {

    override fun greet(name: String): String {
        return "Hey $name! I'm so happy to see you! I'm always delighted when I see you. Seriously!"
    }
}
