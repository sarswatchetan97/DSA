public class ReverseString {

    public static void printArr(char[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverseArr(char[] arr, int start, int end) {
        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String myStr = "Java";
        String reversedMyStr = "";
        char[] myChar = myStr.toCharArray();
        reverseArr(myChar, 0, myChar.length-1);
        printArr(myChar);
    }
}
