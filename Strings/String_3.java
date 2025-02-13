/**
 * ==========================================================
 * Program Name: String_3
 * Description : String 
 * Author      : Nihal Kumar
 * Created On  : 12-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class LoginVerification{
    String email;
    String password;
    LoginVerification(){};
    LoginVerification(String email,String password){
        this.email=email;
        this.password=password;
    };
    public boolean verifylogin(String a,String b){
        if ((email.equalsIgnoreCase(a)==true)&& (password.equals(b)==true)) {
            return true;  
        }
        return false;

    }
}

class LoginVerification2{
    String email;
    String password;
    LoginVerification2(){};
    LoginVerification2(String email,String password){
        this.email=email;
        this.password=password;
    };
    public boolean verificationcheck(String a,String b){
        if ((email.equalsIgnoreCase(a))&& (password==b)) {
            return true;  
        }
        return false;

    }
}

public class String_3 {
    public static void main(String[] args) {
        LoginVerification user1= new LoginVerification("Nihalgmpk@gmail.com","123@fghaj");
        Boolean flag =user1.verifylogin("nihalGMPK@gmail.com","123@gghaj");
        System.out.println("Login Successful: " + flag);

        LoginVerification2 user2= new LoginVerification2("Nihalgmpk@gmail.com","123@fghaj");
        Boolean flag2 =user2.verificationcheck("nihalGMPK@gmail.com","123@gghaj");
        System.out.println("Login Successful: " + flag2);

        
    }   
}
