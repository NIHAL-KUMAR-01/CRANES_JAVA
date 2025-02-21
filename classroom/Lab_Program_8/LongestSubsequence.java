package Lab_Program_8;
/**
 * ==========================================================
 * Program Name: LongestSubsequence
 * Description : Longest Subsequence   
 * Author      : Nihal Kumar
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;

public class LongestSubsequence {
    public void Lsequence(int array[]) {
        try {
            if (array.length < 1) {
                throw new Exception("Array length should be greater or equal to 1");

            } else {
                ArrayList<Integer> sequence = new ArrayList<>();
                int temp = array[0];

                for (int i = 1; i < array.length; i++) {
                    if (array[i] > array[i - 1]) {
                        sequence.add(array[i]);
                    }
                }
                System.out.println(sequence);

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        LongestSubsequence user1= new LongestSubsequence();
        user1.Lsequence(new int []{10, 22, 9, 33, 21, 50, 41, 60, 80});

    }

}
