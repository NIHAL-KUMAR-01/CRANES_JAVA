package classroom.Lab_Program_7;
/**
 * ==========================================================
 * Program Name: Count_No_Of_Words
 * Description : Counting no of words
 * Author      : Nihal Kumar
 * Created On  : 17-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.Scanner;

public class Count_No_Of_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Enter Sentence : ");
        sentence=sc.nextLine();
        sentence=sentence.trim();
        String list[]=sentence.split(" ");
        System.out.println(list.length);


        
    }
    
}
