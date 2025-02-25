package Lab_Program_14;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class CommonElements {
    public static void main(String[] args) {
        LinkedHashSet <Integer> set1 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        LinkedHashSet <Integer> set2 = new LinkedHashSet<>(Arrays.asList(3,4,5,6,7));
        /*Set1: {1, 2, 3, 4, 5}
        Set2: {3, 4, 5, 6, 7}
        Output: {3, 4, 5} */
        set1.retainAll(set2);
        System.out.println(set1);

    }
    
}
