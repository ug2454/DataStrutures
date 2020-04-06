package Sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        long start = System.nanoTime();
        // some time passes


        int[] arr={9,8,7,6,5,4,3,2,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println(Arrays.toString(arr));
        System.out.println(elapsedTime);
    }
}
