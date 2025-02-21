package classroom.Lab_Program_7;
/**
 * ==========================================================
 * Program Name: ReverseWords
 * Description : Reverse the words
 * Author      : Nihal Kumar
 * Created On  : 17-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sentence;
        System.out.print("Enter Sentence : ");
        sentence= sc.nextLine();
        sentence=sentence.trim();
        String rev="";
        String temp="";

        for (int i = sentence.length()-1; i >=0 ; i--) {
            if (sentence.charAt(i)!=' ') {
                temp=sentence.charAt(i)+temp;    
            }
            else{
                rev = rev + temp + " ";
                temp = "";
            }
            
        }
        rev = rev + temp;
        System.out.println(rev);
        
        

    }
    
}
