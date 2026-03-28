public class MoveZeros {

    public static int[] moveZeros(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i=0; i<n; i++) {
            if(arr[i] !=0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] !=0) {
                j++;
            }
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 0, 2, 1, 0, 3};
        printArr(arr);
        printArr(moveZeros(arr));
    }
}
