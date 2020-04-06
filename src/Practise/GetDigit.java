package Practise;

import java.util.Arrays;

public class GetDigit {
    public static void main(String[] args) {
        int arr[] = new int[3];
    int num=123456789;
    int n2=num;
    int count=0;
        for (; n2!=0; n2/=10) {
            int digit = n2%10;

            if (digit!=0 && num%digit==0 ){

                count++;
            }
        }
        System.out.println(count);


//        for (int i=0;i<arr.length;i++){
//
//        }
    }
}
