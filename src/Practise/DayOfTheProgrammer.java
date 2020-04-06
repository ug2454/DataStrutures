package Practise;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        int year = 1918;
        int days = 0;


        if(year < 1918 && year >= 1700) {
            if (year % 4 == 0) {
                days = 244;
            }
            else days=243;
        }
        else if(year==1918){
            days= 243-13;
        }
        else if(year>1918 && year<=2700){
            if(year%400==0 ||(year%4==0 && year%100!=0)){
                days=244;
            }
            else
                days=243;
        }

            int currentDay = 256 - days;
            int month = 9;

            System.out.println(currentDay + ".0" + month + "." + year);

        }
    }
