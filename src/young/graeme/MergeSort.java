package young.graeme;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        //Test cases
        int[] arr1 = {1,0,2,9,3,8,4,7,5,6,3,3,0,7,8,5,6,2,3,8,0,7,6,2,0,8,7,5,6,2,3,5,6,2,3,8,7,5,6,0,2,3,5,7,6,2,3,0,5,8,7,6,2,3,5,8,7,6,2,3,5,8,7,2,6,5,1,2,0,9,3,1,2,3,3,7,5,6,0,1,2,9,3,8};
        mergeSort(arr1, 0, arr1.length-1);
        //System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,1,1,1,1};
        mergeSort(arr2, 0,arr2.length-1);
        //System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        mergeSort(arr3, 0, arr3.length);
        //System.out.println(Arrays.toString(arr3));
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (right + left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge (int[] arr, int left, int middle, int right) {
        int[] L = new int[middle - left + 1];
        int[] R = new int[right - middle];

        for (int i = 0; i < L.length; ++i)
            L[i] = arr[left + i];
        for (int i = 0; i < R.length; ++i)
            R[i] = arr[middle + 1 + i];

        int i = 0, j = 0;

        int k = left;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }


    }

}
