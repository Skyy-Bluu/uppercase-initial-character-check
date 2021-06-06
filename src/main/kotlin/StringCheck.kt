object StringCheck {
    fun isInitialCharacterAtoZUsingUpperCase(string: String): Boolean =
        string.first().isUpperCase()

    fun isInitialCharacterAtoZUsingRegex(string: String) =
        string.contains("[A-Z][a-z]*".toRegex())
}

fun main() {
    println(StringCheck.isInitialCharacterAtoZUsingUpperCase("Hello"))
    println(StringCheck.isInitialCharacterAtoZUsingRegex("Hello"))
}