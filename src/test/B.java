package test;

public class B {
    public static void main(String[] args) {
        int n=10;
        int[] arr= {1,2,3,4,5};
        int toffee=10;
        int number=0;
        int noOfIterations=0;
        for(int i=number;i<arr.length;i++){
            if(number==arr.length-1){
                i=number%arr.length;
            }
            if(toffee==0){
                return;
            }
            else {
                toffee--;
                noOfIterations++;
            }
        }
        System.out.println(noOfIterations);

    }
}
