package Lab_Program_11;
/**
 * ==========================================================
 * Program Name: MergeArray
 * Description : Merge Two ArrayLists and Sort
 * Author      : Nihal Kumar
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;
import java.util.Collections;

public class MergeArray {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(40);
        list1.add(20);
        list1.add(25);
        list1.add(10);
        list1.add(101);
        list1.add(120);
        System.out.println(" ---------------: List 1 :---------------");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(20);
        list2.add(200);
        list2.add(210);
        list2.add(230);
        System.out.println(" ---------------: List 2 :---------------");
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(" ---------------: Merged List :---------------");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(" ---------------: Sorted Merged List :---------------");

        System.out.println(list1);

    }

}
