package Lab_Program_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class InterSectionArrays {
    public ArrayList<Integer> findIntersection(int array1[], int array2[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int num : array1) {
            list1.add(num);
        }

        for (int num : array2) {
            list2.add(num);
        }

        list1.retainAll(list2);
        return list1;
    }

    public static void main(String[] args) {
        InterSectionArrays user = new InterSectionArrays();
        int arr1[] = {23, 2, 2, 2, 2, 2, 2, 2, 2, 63, 25, 36};
        int arr2[] = {2, 2, 2, 2, 6, 63, 25, 23, 3, 23};

        ArrayList<Integer> list = user.findIntersection(arr1, arr2);
        HashSet <Integer> finallist = new HashSet<>(list);

        System.out.println("Intersection Between Array 1 And Array 2 : " + finallist);
    }
}
