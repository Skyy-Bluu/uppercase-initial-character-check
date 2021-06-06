object StringCheck {
    fun isInitialCharacterAtoZUsingUpperCase(string: String): Boolean =
        string.isNotBlank() && string.first().isUpperCase()

    fun isInitialCharacterAtoZUsingRegex(string: String) =
        string.isNotBlank() && string.contains("[A-Z][a-z]*".toRegex())
}

fun main() {
    println(StringCheck.isInitialCharacterAtoZUsingUpperCase("Hello"))
    println(StringCheck.isInitialCharacterAtoZUsingRegex("Hello"))
}