package Lab_Program_8;

/**
 * ==========================================================
 * Program Name: Intersection
 * Description : Implement a function to find the intersection of two arrays and handle exceptions.
 * Author      : Nihal Kumar
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.HashSet;
import java.util.Scanner;

public class Intersection {

    public void FindIntersection(int array1[], int array2[]) {
        try {
            if (array1 == null || array2 == null) {
                throw new NullPointerException("One or both input arrays are null.");
            }
            if (array1.length == 0 || array2.length == 0) {
                throw new IllegalArgumentException("One or both input arrays are empty.");
            }

            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> intersection = new HashSet<>();

            for (int num : array1) {
                set1.add(num);
            }
            for (int num : array2) {
                if (set1.contains(num)) {
                    intersection.add(num);
                }
            }

            if (intersection.isEmpty()) {
                System.out.println("No common elements found.");
            } else {
                System.out.println("Intersection of arrays: " + intersection);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of first array: ");
            int size1 = sc.nextInt();
            int[] array1 = new int[size1];

            System.out.println("Enter elements of first array: ");
            for (int i = 0; i < size1; i++) {
                array1[i] = sc.nextInt();
            }

            System.out.print("Enter size of second array: ");
            int size2 = sc.nextInt();
            int[] array2 = new int[size2];

            System.out.println("Enter elements of second array: ");
            for (int i = 0; i < size2; i++) {
                array2[i] = sc.nextInt();
            }

            Intersection obj = new Intersection();
            obj.FindIntersection(array1, array2);

        } catch (Exception e) {
            System.out.println("Error: Invalid input! " + e);
        } finally {
            sc.close();
        }
    }
}
