package Practise;

public class AppendAndDelete {
    public static void main(String[] args) {
        String string1 = "zzzzz";
        String string2 = "zzzzzzz";
        int sameString = 0;
        int noOfCharDel = 0;
        int k =4;
        for (int i = 0; i < string1.length() && i < string2.length(); i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                sameString++;
            } else break;

        }

        if (string2.length() > string1.length()) {

            if (k<string1.length()) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("String is same for length: " + sameString);
//        System.out.println("After deleting rest of characters");
            noOfCharDel = string1.length() - sameString;
//        System.out.println(noOfCharDel);
            k = k - noOfCharDel;
//        System.out.println("updated k="+k);

//        System.out.println("Characters to add to string 1 to make string 2");
            int noOfCharToAdd = string2.length() - sameString;
            k = k - noOfCharToAdd;

            if (k >= 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
