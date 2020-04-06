package Practise;

public class DrawingBook {
    public static void main(String[] args) {
        int totalPages=10;
        int noOfPageToTurnTo = 4;
        int noOfPagesRequiredfromFront= totalPages/2 -noOfPageToTurnTo/2;
        int noOfPagesRequiredfromback = noOfPageToTurnTo/2;

        System.out.println(Math.min(noOfPagesRequiredfromFront,noOfPagesRequiredfromback));



    }
}
