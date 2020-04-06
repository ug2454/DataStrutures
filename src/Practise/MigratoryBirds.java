package Practise;

public class MigratoryBirds {
    public static void main(String[] args) {
        System.out.println(birds());
    }

    public static int birds() {
        int[] a = {2, 4, 3, 2, 3, 1, 2, 1, 3, 3};
        int n = a.length;
        int bird1 = 0;
        int bird2 = 0;
        int bird3 = 0;
        int bird4 = 0;
        int bird5 = 0;

        int countBird1 = 0;
        int countBird2 = 0;
        int countBird3 = 0;
        int countBird4 = 0;
        int countBird5 = 0;

        for (int item : a) {
            if (item == 1) {
                bird1 = item;
            } else if (item == 2) {
                bird2 = item;
            } else if (item == 3) {
                bird3 = item;
            } else if (item == 4) {
                bird4 = item;
            } else if (item == 5) {
                bird5 = item;
            }
        }

        for (int value : a) {
            if (bird1 == value) {
                countBird1++;
            } else if (bird2 == value) {
                countBird2++;
            } else if (bird3 == value) {
                countBird3++;
            } else if (bird4 == value) {
                countBird4++;
            } else if (bird5 == value) {
                countBird5++;
            }
        }

        int[] arr = new int[5];
        arr[0] = countBird1;
        arr[1] = countBird2;
        arr[2] = countBird3;
        arr[3] = countBird4;
        arr[4] = countBird5;
        int max = arr[0];
        int maxpos = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max) {
                    max=arr[i];
                    maxpos=i;


            }


        }

return (maxpos+1);
    }
}

