package Threads_Program;
/**
 * ==========================================================
 * Program Name: MultiThreadProgram
 * Description : 
 * Author      : Nihal Kumar
 * Created On  : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class AlphabetThread extends Thread{
    AlphabetThread(){
        start();
    }
    public void run(){
        try {
            for ( char i = 'A'; i <= 'E'; i++) {
                System.out.println("From Alphabet Thread "+Thread.currentThread()+ " i "+ i);  
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }  
    }
}

class NumericThread extends Thread{
    public void run(){
        try {
            for ( int i = 0; i <= 9; i++) {
                System.out.println("From Numeric Thread "+Thread.currentThread()+ " i "+ i);  
                Thread.sleep(500);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
public class MultiThreadProgram {
    public static void main(String[] args) {
        AlphabetThread user = new AlphabetThread();
        NumericThread user2 = new NumericThread();
        // user.start();
        user2.start();
        System.out.println(user2.isAlive());
        
    }
    
}
