package Practise;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,1,1,0,0,0,0};
        int n=arr.length;
        int k=3;
        int e=100;

        for(int i=0;i<n;i=i+k){
            if(i==arr.length-1){
                i=i%n;
            }
            if(arr[(i+k)%n]==0) {
                e--;
            }
            else if(arr[(i+k)%n]==1){
                e=e-3;
            }
        }
        System.out.println(e);
    }
}
