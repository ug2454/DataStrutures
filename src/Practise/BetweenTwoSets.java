package Practise;

import java.util.Arrays;

public class BetweenTwoSets {
    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        Arrays.sort(a);
        Arrays.sort(b);
        int min = a[0];
        int max = b[b.length - 1];
        int count1 = 0;
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((hasFactor(i,a)&&(isFactor(i,b)))) {
                    count1=count1+1;
                }
            }
        }
        System.out.println(count1);




    }

    private static boolean isFactor(int num, int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%num==0){
                return true;
            }
        }
        return false;
    }

    private static boolean hasFactor(int num, int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return true;
            }
        }
        return false;
    }


}
