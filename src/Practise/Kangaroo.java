package Practise;

public class Kangaroo {
    public static void main(String[] args) {
        kangaroo(0,3,4,2);
        kangaroo(0,2,5,3);

    }
    public static void kangaroo(int x1, int v1, int x2, int v2){
        if((v1>v2) && ((x1-x2)%(v2-v1)==0)){
            System.out.println("YES");
        }

        else
            System.out.println("NO");

    }

}
