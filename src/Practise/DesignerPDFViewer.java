package Practise;

import java.util.Arrays;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        int[] heightOfLetters = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
        String word = "uday";
        int[] asciarray = new int[word.length()];
        int asciArray;
        long area;
        int max=asciarray[0];
        Character c;
        for(int i=0;i<word.length();i++){
            c=word.charAt(i);
            asciArray=(int)c-97;


            System.out.println(asciArray);
            asciarray[i]=heightOfLetters[asciArray];
            if(asciarray[i]>max){
                max=asciarray[i];
            }

        }
//
//        for(int i=0;i<asciarray.length;i++){
//
//        }
        area=max*word.length();
       System.out.println("Area is:"+area);


    }
}
