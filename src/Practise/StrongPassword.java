package Practise;

public class StrongPassword {
    public static void main(String[] args) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int result1 = 0;
        int r = 0;
        int res=0;
        int num=0;
        int numberCount = 0;
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int specialCharactersCount = 0;

        int n = 100;
        String s = "A**U&UDJ(LWL*OBCFD!%+BCKJ(%)FD)%!Q^GW!)Q$^&Z#-H-%)D+XD&#RU-)FK#FW)T(B*U$!-S&D@%*$)BBMTEJ%^KR!$$FACHR";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numbers.length(); j++) {
                if (s.charAt(i) ==numbers.charAt(j)){
                    numberCount++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lower_case.length(); j++) {
                if (s.charAt(i) ==lower_case.charAt(j)){
                    lowerCaseCount++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < upper_case.length(); j++) {
                if (s.charAt(i) ==upper_case.charAt(j)){
                    upperCaseCount++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < special_characters.length(); j++) {
                if (s.charAt(i) ==special_characters.charAt(j)){
                    specialCharactersCount++;
                }
            }
        }
        
        if (n >= 6 ) {
            if(numberCount==0){
                num++;

            }
             if(lowerCaseCount==0){
                num++;

            }
             if(upperCaseCount==0){
                num++;

            }
             if(specialCharactersCount==0){
                num++;

            }

            System.out.println(num);

        } else if(n<6){
            if(numberCount==0){
                num++;
            }
             if(upperCaseCount==0){
                num++;
            }
             if(lowerCaseCount==0){
                num++;
            }
             if(specialCharactersCount==0){
                num++;
            }



             if(n+num<6){
                r= 6-n;
                 System.out.println(r);
                 return;
             }
            System.out.println(num);

        }


    }
}
