public class PalindromeC implements Palindrome{

    @Override
    public boolean isPalindrome(int x) {
        if(x < 0){
            x = Math.abs(x);
        }

        String palindrome = String.valueOf(x);

        if (palindrome.equals(new StringBuilder(palindrome).reverse().toString())){
            return true;
        }
        return false;
    }
}
