package Practise;

public class ViralAdvertising {
    public static void main(String[] args) {
        int shared=2;
        int totalLikes=2;
        for(int i=1;i<5;i++){
            shared = (shared*3)/2;
            totalLikes+=shared;
        }
        System.out.println(totalLikes);
    }
}
