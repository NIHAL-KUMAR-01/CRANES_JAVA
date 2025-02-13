/**
 * ==========================================================
 * Program Name: Frequency
 * Description : Frequency of the elements in the given Array
 * Author      : Nihal Kumar
 * Created On  : 11-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.*;

public class Frequency {
    public void frequency_element(int a[]) {
        System.out.println("Frequency: \n");
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    count = -1;
                    break;
                }
            }
            if (count == -1) continue; 
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(a[i] + " --- " + count);
        }
    }

    public static void main(Strings[] args) {
        Frequency test= new Frequency();
        int a[]={10,20,5,36,10,20,5,5,25,36,96,52,26,36};
        test.frequency_element(a);
        
    }

    
}
