package Practise;


public class ReverseNumber {
    public static void main(String[] args) {
        int startingDay = 49860;
        int endingDay=205494;
        int count=0;
        int k=155635764;
        for (int i = startingDay; i <=endingDay ; i++) {
            if((i-reverse(i))%k==0){
                count++;
            }

        }
        System.out.println("Beautiful days are: "+count);


    }
    static int reverse(int number){
        int reversed = 0;
        for(;number!=0;number/=10){
            int digit = number%10;
            reversed = reversed*10+digit;
        }
        return reversed;
    }
}
