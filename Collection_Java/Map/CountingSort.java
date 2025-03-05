package Collection_Java.Map;
/**
 * ==========================================================
 * Program Name: CountingSort
 * Description : 
 * Author      : Nihal Kumar
 * Created On  : 27-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        // System.out.println("max max  "+max);
        //9 2 2 3 3 1
        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]=count[num]+1;
        }

        // System.out.println(Arrays.toString(count));

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 2, 3, 3, 3, 1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}