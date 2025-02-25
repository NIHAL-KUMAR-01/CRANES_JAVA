package Lab_Program_14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int array[]= {4,5,9,4,9,3};
        LinkedHashSet  <Integer> list = new LinkedHashSet<>();
        for (int integer : array) {
            list.add(integer);
        }

        System.out.println(list);

    }
    
}
