package net.ralphpina.markdownparser.shared


class Greeting {
    fun greeting(): String {
        return "Guess what it is! > ${Platform().platform.reversed()}!"
//        return "Hello, ${Platform().platform}!"
    }
}
