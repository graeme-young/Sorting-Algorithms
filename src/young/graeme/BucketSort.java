package young.graeme;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class BucketSort {

    public static void main(String[] args) {
        //Test cases
        float[] arr1 = {0.1f,0.0f,0.2f,0.9f,0.3f,0.8f,0.4f,0.7f,0.5f,0.6f,0.3f,0.3f,0.0f,0.7f,0.8f,0.5f,0.6f,0.2f,0.3f,0.8f,0.0f,0.7f,0.6f,0.2f,0.0f,0.8f,0.7f,0.5f,0.6f,0.2f,0.3f,0.5f,0.6f,0.2f,0.3f,0.8f,0.7f,0.5f,0.6f,0.0f,0.2f,0.3f,0.5f,0.7f,0.6f,0.2f,0.3f,0.0f,0.5f,0.8f,0.7f,0.6f,0.2f,0.3f,0.5f,0.8f,0.7f,0.6f,0.2f,0.3f,0.5f,0.8f,0.7f,0.2f,0.6f,0.5f,0.1f,0.2f,0.0f,0.9f,0.3f,0.1f,0.2f,0.3f,0.3f,0.7f,0.5f,0.6f,0.0f,0.1f,0.0f,0.2f,0.9f,0.3f,0.8f};
        bucketSort(arr1, arr1.length);
        //System.out.println(Arrays.toString(arr1));

        float[] arr2 = {0.1f,0.1f,0.1f,0.1f,0.1f};
        bucketSort(arr2, arr2.length);
        //System.out.println(Arrays.toString(arr2));

        float[] arr3 = {};
        bucketSort(arr3, arr3.length);
        //System.out.println(Arrays.toString(arr3));
    }

    public static void bucketSort(float[] arr, int n) {
        if (n <= 0) {
            return;
        }

        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        for (int i = 0; i < n; i++) {
            buckets[(int)(n * arr[i])].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            //Perform insertion sort on each bucket
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }

    }

}
