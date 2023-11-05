// time O(n)   

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 7, 5, 8, 1, 9 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;

            for (int j = 1; j < arr.length - 1; j++) {

                // Swapp if the item ids smaller thyen the prevouis item.
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }

            // if you did not swapp or the particular value of i. it means the array is
            // sorted hence stop the program

            if (!swapped)
                break;
        }
    }

}
