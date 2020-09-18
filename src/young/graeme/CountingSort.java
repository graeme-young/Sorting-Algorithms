package young.graeme;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class CountingSort {

    public static void main(String[] args) {
        //Test cases
        int[] arr1 = {1,0,2,9,3,8,4,7,5,6,3,3,0,7,8,5,6,2,3,8,0,7,6,2,0,8,7,5,6,2,3,5,6,2,3,8,7,5,6,0,2,3,5,7,6,2,3,0,5,8,7,6,2,3,5,8,7,6,2,3,5,8,7,2,6,5,1,2,0,9,3,1,2,3,3,7,5,6,0,1,2,9,3,8};
        countingSort(arr1, arr1.length);
        //System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,1,1,1,1};
        countingSort(arr2, arr2.length);
        //System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        countingSort(arr3, arr3.length);
        //System.out.println(Arrays.toString(arr3));
    }

    public static void countingSort(int[] arr, int n) {
        if (n <= 0) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int count[] = new int[max - min + 1];
        int output[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }

}
