package Practise;

public class BirthdayBar {
    public static void main(String[] args) {
        int arr[] = {2 ,3, 4, 4, 2, 1, 2, 5, 3, 4, 4, 3, 4, 1, 3, 5, 4, 5, 3, 1, 1, 5, 4, 3, 5, 3, 5, 3, 4, 4, 2, 4, 5, 2, 3, 2, 5, 3, 4, 2, 4, 3, 3, 4, 3, 5, 2, 5, 1, 3, 1, 4, 2, 2, 4, 3, 3, 3, 3, 4, 1, 1, 4, 3, 1, 5, 2, 5, 1, 3, 5, 4, 3, 3, 1, 5, 3,3 ,3 ,4 ,5 ,2};
//        int[] arr = {1, 2,1,3,2};
        int m = 5;
        int d = 16;
        int n=arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
//            int limit = i + m;
            if ((i+m) > n)
            {
                break;
            }

            int sum=0;
            for (int j = i; j < (m+i) ; j++) {

                sum =sum+arr[j];

            }
            if (sum == d) {
                count++;
            }
        }

        System.out.println(count);


    }
}
