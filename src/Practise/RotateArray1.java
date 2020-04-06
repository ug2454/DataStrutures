package Practise;

import java.util.Arrays;

public class RotateArray1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        int n = arr.length;
        int[] result = new int[n];
        int rot = 1;
        for (int i = 0; i < rot; i++) {
            result = rotateArray(arr, n);
        }
        System.out.println(Arrays.toString(result));

    }

    private static int[] rotateArray(int[] arr, int n) {
        int temp = 0;
        int temp2 = 0;
        temp = arr[0];
        temp2 = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n - 1] = temp;
        arr[0]=temp2;
        return arr;
    }
}

