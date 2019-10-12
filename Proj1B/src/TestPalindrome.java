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
        String test1 = "cat";
        String test2 = "racecar";
        String test3 = "aaa";
        String test4 = "q";
        String test5 = "";
        assertFalse(palindrome.isPalindrome(test1));
        assertTrue(palindrome.isPalindrome(test2));
        assertTrue(palindrome.isPalindrome(test3));
        assertTrue(palindrome.isPalindrome(test4));
        assertTrue(palindrome.isPalindrome(test5));


    }

    @Test
    public void testisParlindrome_offByOne(){
        String test1 = "racecar";
        String test2 = "flake";
        String test3 = "q";
        String test4 = "";
        CharacterComparator q = new OffByOne();

        assertFalse(palindrome.isPalindrome(test1,q));
        assertTrue(palindrome.isPalindrome(test2,q));
        assertTrue(palindrome.isPalindrome(test3,q));
        assertTrue(palindrome.isPalindrome(test4,q));


    }
    @Test
    public void testisParlindrome_offByN(){
        String test1 = "bidding";
        String test2 = "linking";
        String test3 = "q";
        String test4 = "";
        String test5 = "racecar";
        CharacterComparator q = new OffByN(5);

        assertTrue(palindrome.isPalindrome(test1,q));
        assertTrue(palindrome.isPalindrome(test2,q));
        assertTrue(palindrome.isPalindrome(test3,q));
        assertTrue(palindrome.isPalindrome(test4,q));
        assertFalse(palindrome.isPalindrome(test5,q));

    }

}     //Uncomment this class once you've created your Palindrome class.