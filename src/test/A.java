package test;

public class A {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10,12};
        int target =11;
        int low=0;
        int ans=0;
        int high =arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                high=mid-1;
            }
            else
                low= mid+1;
        }
        System.out.println(ans);
    }
}
