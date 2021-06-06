import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class StringCheckTest{

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsTrueWhenGivenStringWithInitialUpperCaseLetter(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingRegex("Yes")
        assertTrue(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsFalseWhenGivenStringWithInitialLowerCaseLetter(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingRegex("no")
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsTrueWhenGivenStringWithInitialUpperCaseLetter(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingUpperCase("Yes")
        assertTrue(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsFalseWhenGivenStringWithInitialLowerCaseLetter(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingUpperCase("no")
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsFalseWhenGivenBlankString(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingUpperCase(" ")
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsFalseWhenGivenBlankString(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingRegex(" ")
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsFalseWhenGivenEmptyString(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingUpperCase("")
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsFalseWhenGivenEmptyString(){
        val boolean = StringCheck.isInitialCharacterAtoZUsingRegex("")
        assertFalse(boolean)
    }
}