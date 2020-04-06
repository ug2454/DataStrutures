package test;

public class Test {
    public static void main(String[] args) {
        String s="12:15:00AM";
        System.out.println(timeConversion(s));
    }
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int len = s.length();
        String s1= s.substring(0,s.indexOf(':'));
        System.out.println(s);
        String pm = s.substring(8,len);
        if(s.equals("12:00:00AM")){
            return "00:00:00";
        }
        if(s.equals("12:00:00PM")){
            return "12:00:00";
        }
        if(pm.equals("PM")){
            if(Integer.parseInt(s1)<13 && Integer.parseInt(s1)>=12){
                String s6=s.substring(0,len-2);
                return s6;
            }

            String s2= s.substring(s.indexOf(':'),len-2);
            int s_2 = Integer.parseInt(s1)+12;
            String s3 = String.valueOf(s_2);
            String s4=s3+s2;
            return s4;
        }
        else if(pm.equals("AM") ){
            if(Integer.parseInt(s1)==12 && Integer.parseInt(s1)<13){
                String s2 = "00";
                String s3 = s.substring(s.indexOf(':'),len-2);
                String s4 = s2+s3;
                return s4;
            }
            String s5=s.substring(0,len-2);
            return s5;
        }
        return null;

    }
}
