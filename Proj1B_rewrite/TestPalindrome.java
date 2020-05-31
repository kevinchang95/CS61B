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

    @Test
    public void testisPalindrome_OffByOne(){

        String pa1 = "nopm";
        String pa2 = "racebbs";
        String pa3 = "a";
        String pa4 = "";
        String npa1 = "fate";
        String npa2 = "radecar";
        String npa3 = "unilateral";
        /**This still works since charequal is overridden*/
        CharacterComparator offByOne = new OffByOne();
        //OffByOne offByOne = new OffByOne();

        assertTrue(palindrome.isPalindrome(pa1,offByOne));
        assertTrue(palindrome.isPalindrome(pa2,offByOne));
        assertTrue(palindrome.isPalindrome(pa3,offByOne));
        assertTrue(palindrome.isPalindrome(pa4,offByOne));
        assertFalse(palindrome.isPalindrome(npa1,offByOne));
        assertFalse(palindrome.isPalindrome(npa2,offByOne));
    }

    @Test
    public void testisPalindrome_OffByN(){

        String pa1 = "unzip";
        String pa2 = "sworn";
        String pa3 = "a";
        String pa4 = "";
        String npa1 = "fate";
        String npa2 = "radecar";
        String npa3 = "unilateral";
        /**This still works since charequal is overridden*/
//        CharacterComparator offByOne = new OffByOne();
        //OffByOne offByOne = new OffByOne();
        CharacterComparator offByN = new OffByN(5);
        assertTrue(palindrome.isPalindrome(pa1,offByN));
        assertTrue(palindrome.isPalindrome(pa2,offByN));
        assertTrue(palindrome.isPalindrome(pa3,offByN));
        assertTrue(palindrome.isPalindrome(pa4,offByN));
        assertFalse(palindrome.isPalindrome(npa1,offByN));
        assertFalse(palindrome.isPalindrome(npa2,offByN));
    }


    @Test
    public void testequalChars(){
        CharacterComparator offByOne = new OffByOne();

        assertTrue(offByOne.equalChars('a','b'));
        assertTrue(offByOne.equalChars('b','a'));
        assertFalse(offByOne.equalChars('a','a'));
        assertFalse(offByOne.equalChars('a','z'));
        assertFalse(offByOne.equalChars('b','q'));


    }


}     /**Uncomment this class once you've created your Palindrome class.*/