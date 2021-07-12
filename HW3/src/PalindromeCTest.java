import org.junit.Test;
import org.junit.Assert;
public class PalindromeCTest {
    @Test
    public void correctOne(){
        PalindromeC palindrome = new PalindromeC();
        Assert.assertTrue(palindrome.isPalindrome(1));
    }

    @Test
    public void correctThree(){
        PalindromeC palindrome = new PalindromeC();
        Assert.assertTrue(palindrome.isPalindrome(121));
    }

    @Test
    public void correctNegative(){
        PalindromeC palindrome = new PalindromeC();
        Assert.assertTrue(palindrome.isPalindrome(-123321));
    }

    @Test
    public void inCorrectNegative(){
        PalindromeC palindrome = new PalindromeC();
        Assert.assertFalse(palindrome.isPalindrome(-2468));
    }

    @Test
    public void inCorrectFive(){
        PalindromeC palindrome = new PalindromeC();
        Assert.assertFalse(palindrome.isPalindrome(13579));
    }
}
