package young.graeme;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        BucketSort bucket = new BucketSort();
        CountingSort counting = new CountingSort();
        QuickSort quick = new QuickSort();

        //Timing each type of sort on equivalent test cases
        long startTime = System.currentTimeMillis();
        bubble.main(null);
        long endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        merge.main(null);
        endTime = System.currentTimeMillis();
        System.out.println("Merge Sort: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        bucket.main(null);
        endTime = System.currentTimeMillis();
        System.out.println("Bucket Sort: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        counting.main(null);
        endTime = System.currentTimeMillis();
        System.out.println("Counting Sort: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        quick.main(null);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort: " + (endTime - startTime));

    }
}
