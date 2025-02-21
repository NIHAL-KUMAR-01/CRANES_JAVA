package Lab_Program_11;
/**
 * ==========================================================
 * Program Name: MaximumElement
 * Description : Finding Maximum element in the array
 * Author      : Nihal Kumar
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElement {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("The Maximum Element in the ArrayList is "+ list.get(list.size()-1));

    }
    
}
