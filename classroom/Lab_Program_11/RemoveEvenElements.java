package Lab_Program_11;
/**
 * ==========================================================
 * Program Name: RemoveEvenElements
 * Description : Remove Even Numbers from an ArrayList
 * Author      : Nihal Kumar
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;

public class RemoveEvenElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(40);
        list.add(15);
        System.out.println("Before Removal of Even Elements");
        System.out.println(list);

        list.removeIf(n->(n%2)==0);
        System.out.println("After Removal of Even Elements");
        System.out.println(list);
    }

}
