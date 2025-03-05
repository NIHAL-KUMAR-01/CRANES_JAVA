public class SubstringDemo {
    /**
     * ==========================================================
     * Program Name: SubstringDemo
     * Description : 
     * Author      : Nihal Kumar
     * Created On  : 28-02-2025
     * Organization: C.V. Raman Global University
     * ==========================================================
     * Copyright (c) 2025, All rights reserved.
     * ==========================================================
     */
    
    public static void main(String[] args) {
        int array[] = { 3, -4, 5, 4, -1, 7, -8 };
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum = sum + array[i];
                    System.out.print(array[i] + " ");
                }
                System.out.println(sum);
                System.out.println();
            }
            System.out.println();

        }
        int max_sum = Integer.MIN_VALUE;

        for (int start = 0; start < array.length; start++) {
            int currentsum = 0;
            for (int end = start; end < array.length; end++) {
                currentsum = currentsum + array[end];
                if (currentsum > max_sum) {
                    max_sum = currentsum;

                }
            }

        }
        System.out.println("Max sum is : " + max_sum);

        // kadane's Algorithm

        int csum = 0;
        int msum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            csum = csum + array[i];

            if (csum > msum) {
                msum = csum;
            } else if (csum < 0) {
                csum = 0;
            }
        }
        System.out.println(msum);
    }

}
