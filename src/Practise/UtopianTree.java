package Practise;

public class UtopianTree {
    public static void main(String[] args) {
        int n=5;
        int height =1;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                height++;
                System.out.println(height);
            }
            else if(i%2!=0){
                height=height*2;
                System.out.println(height);
            }

        }
    }
}
