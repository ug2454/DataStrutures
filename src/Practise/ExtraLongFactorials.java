package Practise;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        int n=25;

        BigInteger finalFact = new BigInteger("1");

        for(int i=1;i<=n;i++){
            finalFact = finalFact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(finalFact);

    }
}
