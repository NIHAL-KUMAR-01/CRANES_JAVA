package Lab_Program_14;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Subset {
    public static void main(String[] args) {
        LinkedHashSet <Integer> set1 = new LinkedHashSet<>(Arrays.asList(1,2,3));
        System.out.println("Set 1 : "+set1);
        LinkedHashSet <Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Set 2 : "+set2);
        System.out.println("checking if one is a subset of another: "+ set2.containsAll(set1));

    }
    
}
