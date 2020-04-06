package Practise;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int value = 8;

        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == value) {
                System.out.println("value found at " + mid);
                return;
            } else if (value < arr[mid]) {
                lo = mid + 1;
            } else if (value > arr[mid]) {
                hi = mid - 1;
            }
        }

    }
}
