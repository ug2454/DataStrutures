package codedayschallenge;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
            StringBuilder even= new StringBuilder();
            StringBuilder odd = new StringBuilder();
            s=scanner.next();
            for(int j=0;j<s.length();j++){
                if(j%2==0){
                    even.append(s.charAt(j));

                }
                 else{
                   odd.append(s.charAt(j));

                }
            }
            System.out.println(even);
            System.out.println(odd);
        }


    }
}
