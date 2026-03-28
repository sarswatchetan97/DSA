public class CheckPalindrome {

    public static boolean isPalindrome(String str) {

        char[] ipArr = str.toCharArray();
        int start = 0;
        int end = ipArr.length-1;

        while(start<end) {
            if(ipArr[start] != ipArr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "madam";
        System.out.println(isPalindrome(ip));
    }
}
