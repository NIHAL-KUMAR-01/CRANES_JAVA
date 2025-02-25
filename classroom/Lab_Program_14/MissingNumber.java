package Lab_Program_14;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MissingNumber {
    public static void main(String[] args) {
        LinkedHashSet <Integer> list1 = new LinkedHashSet<>();
        int n=7;
        for (int i = 1; i <= n; i++) {
            list1.add(i);    
        }

        LinkedHashSet <Integer> list2 = new LinkedHashSet<>(Arrays.asList(1,2,4,6,7));
        list1.removeAll(list2);
        System.out.println(list1);


    }
    
}
