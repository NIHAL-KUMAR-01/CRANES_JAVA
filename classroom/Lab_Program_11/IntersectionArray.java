package Lab_Program_11;
/**
 * ==========================================================
 * Program Name: IntersectionArray
 * Description : Write a Java program to find the intersection of two arrays
 * Author      : Nihal Kumar
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(40);
        list1.add(20);
        list1.add(25);
        list1.add(10);
        list1.add(101);
        list1.add(120);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(20);
        list2.add(200);
        list2.add(210);
        list2.add(230);

        list1.retainAll(list2);// intersection 
        System.out.println(list1);



    }
    
}
