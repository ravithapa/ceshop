import org.junit.Test;
import project.project2.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    void testPalindromePass(){
        String test= "aba";
        assertEquals(true, palindrome.isPalindrome(test));
    }

    @Test
    void testPalindromeFalse(){
        String test= "aat";
        assertEquals(false, palindrome.isPalindrome(test));
    }

}