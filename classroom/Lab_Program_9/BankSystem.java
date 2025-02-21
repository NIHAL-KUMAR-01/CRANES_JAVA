package Lab_Program_9;
/**
 * ==========================================================
 * Program Name: BankSystem
 * Description : MultiThreading
 * Author      : Nihal Kumar
 * Created On  : 19-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */


class BankAccount implements Runnable {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread() + " is trying to withdraw: " + amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance = balance - amount;
            try {
                if (balance >= 0) {
                    System.out.println(Thread.currentThread() + " completed withdrawal. Remaining balance: " + balance);
                }
                else{
                    throw new Exception("!!!!!!!!!!!!Negative Balance !!!!!!!!!!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread() + " failed to withdraw due to insufficient funds.");
        }
    }

    public void run() {
        withdraw(500);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        Thread t1 = new Thread(account, "User1");
        Thread t2 = new Thread(account, "User2");
        Thread t3 = new Thread(account, "User3");

        t1.start();
        t2.start();
        t3.start();
    }
}
