package Practise;

public class DivisibleSumPair {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,1,2};
        int n=arr.length;
        int k=3;
int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                if(j>i) {
                    sum = arr[i] + arr[j];
                    if (sum % k == 0) {
                        System.out.println(i + "," + j);
                        count = count + 1;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
