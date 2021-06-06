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
}