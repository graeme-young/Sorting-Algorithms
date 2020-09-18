package young.graeme;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        //Test cases
        int[] arr1 = {1,0,2,9,3,8,4,7,5,6,3,3,0,7,8,5,6,2,3,8,0,7,6,2,0,8,7,5,6,2,3,5,6,2,3,8,7,5,6,0,2,3,5,7,6,2,3,0,5,8,7,6,2,3,5,8,7,6,2,3,5,8,7,2,6,5,1,2,0,9,3,1,2,3,3,7,5,6,0,1,2,9,3,8};
        bubbleSort(arr1);
        //System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,1,1,1,1};
        bubbleSort(arr2);
        //System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        bubbleSort(arr3);
        //System.out.println(Arrays.toString(arr3));
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j]  = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
