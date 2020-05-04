package Practise;

public class SuperReducedString {
    public static void main(String[] args) {
        String s="aa";
        int len = s.length();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                s=s.substring(0,i-1)+s.substring(i+1);
                i=0;
            }

        }
        if(s.length()==0){
            System.out.println("EMPTY STRING");
        }
        else {
            System.out.println(s);
        }
    }
}
