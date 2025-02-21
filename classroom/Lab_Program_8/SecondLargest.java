package Lab_Program_8;
/**
 * ==========================================================
 * Program Name: SecondLargest
 * Description : Second largest of an array
 * Author      : Nihal Kumar
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public void findSecondLargest(int[] array, int size) {
        try {
            if (size < 2) {
                throw new ArithmeticException("Length of array should be greater than or equal to 2");
            } else {
                Arrays.sort(array);
                System.out.println("Second largest Element is: " + array[size - 2]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        SecondLargest user = new SecondLargest();
        user.findSecondLargest(array, size);
    }
}
