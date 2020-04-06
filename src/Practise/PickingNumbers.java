package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(1);
        Collections.sort(list);
        int count = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() ;j++) {
                if (Math.abs(list.get(i) - list.get(j)) <= 1) {
                    count++;
                }
            }
            if (count > max)
                max = count;
            count = 0;
        }
        System.out.println(max);
    }
}
