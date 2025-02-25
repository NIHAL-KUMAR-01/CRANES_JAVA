package Lab_Program_14;

import java.util.LinkedHashSet;

public class DistinctElements {
    public static void main(String[] args) {
        
        int array[]= {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};

        LinkedHashSet <Integer> list = new LinkedHashSet<>();
        

        for (int i : array) {
            list.add(i);
        }
        System.out.println(list.size());
    }
}
