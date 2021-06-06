import StringCheck.isInitialCharacterAtoZUsingRegex
import StringCheck.isInitialCharacterAtoZUsingUpperCase

object StringCheck {

//    fun isInitialCharacterAtoZUsingUpperCase(string: String): Boolean =
//        string.isNotBlank() && string.first().isUpperCase()
//
//    fun isInitialCharacterAtoZUsingRegex(string: String) =
//        string.isNotBlank() && string.contains("[A-Z][a-z]*".toRegex())

    fun String.isInitialCharacterAtoZUsingUpperCase(): Boolean =
        isNotBlank() && first().isUpperCase()

    fun String.isInitialCharacterAtoZUsingRegex(): Boolean =
        isNotBlank() && contains("[A-Z][a-z]*".toRegex())
}

fun main() {
    println("Hello".isInitialCharacterAtoZUsingUpperCase())
    println("Hello".isInitialCharacterAtoZUsingRegex())
}