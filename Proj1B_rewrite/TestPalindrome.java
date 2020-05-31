import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }
    @Test
    public void testisPalindrome(){

        String pa1 = "noon";
        String pa2 = "racecar";
        String pa3 = "a";
        String pa4 = "";
        String npa1 = "fate";
        String npa2 = "radecar";
        String npa3 = "unilateral";

        assertTrue(palindrome.isPalindrome(pa1));
        assertTrue(palindrome.isPalindrome(pa2));
        assertTrue(palindrome.isPalindrome(pa3));
        assertTrue(palindrome.isPalindrome(pa4));
        assertFalse(palindrome.isPalindrome(npa1));
        assertFalse(palindrome.isPalindrome(npa2));
    }


}     /**Uncomment this class once you've created your Palindrome class.*/