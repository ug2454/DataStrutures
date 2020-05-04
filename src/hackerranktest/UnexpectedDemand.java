package hackerranktest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnexpectedDemand {
    public static void main(String[] args) {
        List<Integer> order = new ArrayList<>();
        order.add(10);
        order.add(20);
        order.add(30);
        order.add(10);
        int k=40;

        int count=0;
        Set set = new HashSet(order);
        System.out.println(set);
        int len= order.size();
        for(int i=0;i<len;i++){
//            if(li.get(i)){
                count++;
//            }
        }
        System.out.println(count);
    }
}
