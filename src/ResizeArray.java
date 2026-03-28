public class ResizeArray {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] resizeArr(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 9, 10};
        System.out.println("Length of arr before resize - " +arr.length);
        arr = resizeArr(arr, 10);
        System.out.println("Length of arr after resize - " +arr.length);
    }
}
