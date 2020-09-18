package young.graeme;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        //Test cases
        int[] arr1 = {1,0,2,9,3,8,4,7,5,6,3,3,0,7,8,5,6,2,3,8,0,7,6,2,0,8,7,5,6,2,3,5,6,2,3,8,7,5,6,0,2,3,5,7,6,2,3,0,5,8,7,6,2,3,5,8,7,6,2,3,5,8,7,2,6,5,1,2,0,9,3,1,2,3,3,7,5,6,0,1,2,9,3,8};
        quickSort(arr1, 0, arr1.length-1);
        //System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,1,1,1,1};
        quickSort(arr2, 0,arr2.length-1);
        //System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        quickSort(arr3, 0, arr3.length);
        //System.out.println(Arrays.toString(arr3));
    }

    //Recursive quicksort algorithm
    private static void quickSort(int[] arr, int low, int high) {
        int partitionIndex;
        if (low < high) {
            partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot, i;

        pivot = arr[high];
        i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                //Swapping arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
