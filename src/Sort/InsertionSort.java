package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        long start = System.nanoTime();
        // some time passes
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != i) {
                int temp =arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println(Arrays.toString(arr));
        System.out.println(elapsedTime);
    }
}
