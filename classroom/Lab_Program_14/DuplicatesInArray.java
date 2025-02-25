package Lab_Program_14;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int array[] = {2, 5, 6, 8, 5, 2, 9, 10};
        ArrayList<Integer> list = new ArrayList<>();

        for (int integer : array) {
            list.add(integer);
        }
        System.out.println("Original List: " + list);

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> duplicateSet = new LinkedHashSet<>();

        for (int integer : list) {
            if (!uniqueSet.add(integer)) { 
                duplicateSet.add(integer);
            }
        }

        System.out.println("Unique Elements (Set): " + uniqueSet);
        System.out.println("Duplicate Elements: " + duplicateSet);
    }
}
