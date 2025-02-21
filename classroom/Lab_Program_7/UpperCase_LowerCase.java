package classroom.Lab_Program_7;
/**
 * ==========================================================
 * Program Name: UpperCase_LowerCase
 * Description : Uppercase and lowercase
 * Author      : Nihal Kumar
 * Created On  : 17-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */


import java.util.Scanner;

public class UpperCase_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String word = sc.nextLine();

        char words[] = word.toCharArray(); 

        for (int i = 0; i < words.length; i++) {
            if (words[i] >= 'a' && words[i] <= 'z') {
                words[i] = (char) (words[i] - 32); 
            }
        }

        System.out.println("Uppercase Word: " + new String(words));

        for (int i = 0; i < words.length; i++) {
            if (words[i]>='A' && words[i]<='Z') {
                words[i]=(char) (words[i]+32);   
            }
            
        }
        System.out.println("LowerCase Letter: "+new String(words));   
        sc.close(); 
    }
}
