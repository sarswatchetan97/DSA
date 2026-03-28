public class PalindromeDemo {

    public boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while(start < end) {
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeDemo palindromeDemo = new PalindromeDemo();
        if (palindromeDemo.isPalindrome("that")) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
