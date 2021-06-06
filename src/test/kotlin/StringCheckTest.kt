import StringCheck.isInitialCharacterAtoZUsingRegex
import StringCheck.isInitialCharacterAtoZUsingUpperCase
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class StringCheckTest{

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsTrueWhenGivenStringWithInitialUpperCaseLetter(){
        val boolean = "Yes".isInitialCharacterAtoZUsingRegex()
        assertTrue(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsFalseWhenGivenStringWithInitialLowerCaseLetter(){
        val boolean = "no".isInitialCharacterAtoZUsingRegex()
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsTrueWhenGivenStringWithInitialUpperCaseLetter(){
        val boolean = "Yes".isInitialCharacterAtoZUsingUpperCase()
        assertTrue(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsFalseWhenGivenStringWithInitialLowerCaseLetter(){
        val boolean = "no".isInitialCharacterAtoZUsingUpperCase()
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsFalseWhenGivenBlankString(){
        val boolean = " ".isInitialCharacterAtoZUsingUpperCase()
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsFalseWhenGivenBlankString(){
        val boolean = " ".isInitialCharacterAtoZUsingRegex()
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingUpperCaseReturnsFalseWhenGivenEmptyString(){
        val boolean = "".isInitialCharacterAtoZUsingUpperCase()
        assertFalse(boolean)
    }

    @Test
    fun isInitialCharacterAtoZUsingRegexReturnsFalseWhenGivenEmptyString(){
        val boolean = "".isInitialCharacterAtoZUsingRegex()
        assertFalse(boolean)
    }
}