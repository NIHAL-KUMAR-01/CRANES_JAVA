/**
 * ==========================================================
 * Program Name: StringDigit
 * Description : Checking if String contains only digit or not 
 * Author      : Nihal Kumar
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package Lab_Program_8;

public class StringDigit {
    // public Boolean CheckDigit(String data){
    //     Boolean flag=false;
    //     for (int i = 0; i < data.length(); i++) {
    //         if (data.charAt(i)>='0' && data.charAt(i)<='9') {
    //             flag=true;
                
    //         }else{
    //             flag=false;
    //             return flag;
    //         }
    //     }
    //     return flag;
    // }
    public void CheckDigits(String data){
        try {
            if (data.isEmpty() || data==null) {
                throw new Exception ("Your input string is Null");
                
            }else{
                Boolean flag=false;
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i)>='0' && data.charAt(i)<='9') {
                        flag=true;
                        
                    }else{
                        flag=false;
                        break;
                    }
                }
                if (flag==true) {
                    System.out.println("All are Digits");
                    
                }else{
                    System.out.println("No No No No All are not digits");
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        StringDigit user2 = new StringDigit();
        user2.CheckDigits("");
        
    }
    
}
