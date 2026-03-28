public class MissingNumber {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = (n*(n+1))/2;
        for (int ele : arr) {
            sum = sum - ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
        printArr(arr);
        System.out.println(findMissingNumber(arr));
    }
}
