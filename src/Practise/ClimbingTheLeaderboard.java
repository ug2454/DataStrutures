package Practise;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        int[] scores = {100, 90, 90, 80};
        int[] ranks = new int[scores.length];
        int[] aliceScores = {70, 80, 105};
        int[] res = new int[aliceScores.length];
        ranks[0]=1;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scores[i - 1]) {
                ranks[i] = ranks[i - 1];
            } else
                ranks[i] = ranks[i - 1] + 1;
        }
        System.out.println(Arrays.toString(ranks));

        for(int i=0;i<aliceScores.length;i++){
            int alicescore = aliceScores[i];
            if(alicescore>scores[0]){
                res[i]=1;
            }
            else if(alicescore<scores[scores.length-1]){
                res[i] = ranks[scores.length-1]+1;
            }
            else {
                int index = binarySearch(scores,alicescore);
                res[i]=ranks[index];
            }
        }
        System.out.println(Arrays.toString(res));
    }

    private static int binarySearch(int[] a, int key) {
        int lo=0;
        int hi = a.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key && key<a[mid-1]){
                return  mid;
            }
            else if(a[mid]>key && key>=a[mid-1]){
                return mid+1;

            }
            else if(a[mid]<key){
                hi=mid-1;
            }
            else if(a[mid]>key){
                lo = mid+1;
            }
        }
        return -1;
    }



}

