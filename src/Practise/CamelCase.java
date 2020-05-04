package Practise;

public class CamelCase {
    public static void main(String[] args) {
        String s="oneTwoThree";
        int count=0;
        char ch;
        Character c;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            int chars=(int)ch;
            if(chars<97){
                count++;
            }

        }
        System.out.println("total words= "+(count+1));
    }
}
