package Lab_Program_8;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ==========================================================
 * Program Name: CopyPrimes
 * Description : Copy all prime no into another array
 * Author : Nihal Kumar
 * Created On : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class CopyPrimes {
    public boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void PrimeCopy(int a[]) {
        try {
            if (a.length < 1) {
                throw new Exception("Length of Array should be Greater than equal to one");
            } else {
                ArrayList<Integer> prime_list = new ArrayList<>();
                for (int i = 0; i < a.length; i++) {
                    if (isPrime(a[i])) {
                        prime_list.add(a[i]);

                    }

                }
            System.out.println(prime_list);
            HashSet<Integer> uniquePrimes = new HashSet<>(prime_list);
            System.out.println("Prime numbers without duplicates: " + uniquePrimes);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        CopyPrimes user = new CopyPrimes();
        user.PrimeCopy(new int[]{2,6,9,3,8,2});

    }

}
