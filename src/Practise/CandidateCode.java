package Practise;

import java.util.Scanner;


    public class CandidateCode {
        public static void main(String args[] ) throws Exception {

            //Write code here
            int n;
            int teamMembers;
            Scanner scan = new Scanner(System.in);
            n=scan.nextInt();

            for(int i=0;i<n;i++){
                teamMembers=scan.nextInt();
                int[] team1Power= new int[teamMembers];
                int[] team2Power = new int[teamMembers];


                for(int j=0 ;j<teamMembers;j++){
                    team1Power[j]=scan.nextInt();
                }
                for(int k=0 ;k<teamMembers;k++){
                    team2Power[k]=scan.nextInt();
                }

              int result=  fights(team1Power,team2Power);
                System.out.println(result);
            }
            scan.close();
        }
        public static int fights(int[] teamGrev, int[] team2Power){
            int n = teamGrev.length;
            int m = team2Power.length;
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<m;j++){
                    if(teamGrev[i]>team2Power[j]){
                        count++;
                    }
                }
            }
            return count;
        }
    }

