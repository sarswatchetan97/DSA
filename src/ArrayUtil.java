//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayUtil {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArr = new int[4];
//        printArray(myArr);
        myArr[0] = 5;
        myArr[1] = 1;
        myArr[2] = 2;
        myArr[3] = 8;
        myArr[2] = 6;
//        myArr[4] = 10;
        printArray(myArr);
        System.out.println(myArr.length);
        System.out.println("Last element: " + (myArr[myArr.length-1]));

        int[] arr = {5, 1, 8, 10};
        printArray(arr);
    }

    public static void main(String[] args) {
            ArrayUtil arrayUtil = new ArrayUtil();
            arrayUtil.arrayDemo();
        }
    }