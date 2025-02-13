import java.util.Scanner;
/**
 * ==========================================================
 * Program Name: Solution
 * Description : 
 * Author      : Nihal Kumar
 * Created On  : 12-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
public class Solution {
    public static void main(Strings[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        int skipped_index;
        skipped_index= sc.nextInt();
        int array[]= new int [num];
        for(int item :array){
            item=sc.nextInt();
        }

        int total_cost=0;
        for(int i: array){
            if(i==skipped_index){
                continue;
            }
            total_cost=total_cost+i;
        }
        int half= total_cost/2;
        int anna;
        anna=sc.nextInt();
        if (half==anna) {
            System.out.println("Bon Appetit");
            
        }else if(half > anna){
            System.out.println(half-anna);
        }else{
            System.out.println(anna-half);
        }


    }
    
}
