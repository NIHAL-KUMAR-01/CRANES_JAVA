package Lab_Program_11;
/**
 * ==========================================================
 * Program Name: SecondLargest
 * Description : Implement a function to find the second
largest element in an array.
 * Author      : Nihal Kumar
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        int element;
        System.out.print("Enter No of Elements : ");
        element = sc.nextInt();
        System.out.println("Enter Data : ");
        for (int i = 0; i < element ; i++) {
            int temp = sc.nextInt();
            list.add(temp);
            
        }
        System.out.println(list);
        HashSet <Integer> finallist = new HashSet<>(list);
        // System.out.println(finallist);
        list = new ArrayList<>(finallist);
        Collections.sort(list);

        System.out.println(list);

        System.out.println("The Second largest element in the Array is : "+ list.get(list.size()-2));

    }
    
}
