package Practise;

public class CountValleys {
    public static void main(String[] args) {
        String hike = "UDDDUDUU";
        int depth = 0;
       int valley = 0;
        int sum3;
        for (int i = 0; i < hike.length(); i++) {
            if (hike.charAt(i) == 'D') {
                depth--;
            } else if (hike.charAt(i) == 'U') {
                depth++;
            }



                
                if (depth == 0 && hike.charAt(i)=='U') {
                    valley++;
                }


        }
        System.out.println(valley);

    }
}
