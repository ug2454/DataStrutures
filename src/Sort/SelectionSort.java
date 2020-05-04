package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        long start = System.nanoTime();
        // some time passes
        int[] arr = {9, 8, 7, 6, 5, 4, 6, 3, 2, 1};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
