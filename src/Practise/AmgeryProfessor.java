package Practise;

import java.util.Scanner;

public class AmgeryProfessor {
    public static void main(String[] args) {

        int cancellationThreshold = 3;
        int[] arrivalTimeOfStudents = {-1,-3,4,2};
        int n = arrivalTimeOfStudents.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arrivalTimeOfStudents[i] > 0) {
                count++;
            }
        }
        if (count <= cancellationThreshold) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }

    }
}
