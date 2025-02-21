package Threads_Program;

/**
 * ==========================================================
 * Program Name: AlliveJoine
 * Description : Alive and Join
 * Author : Nihal Kumar
 * Created On : 18-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
class NewThread implements Runnable {
    Thread t;
    String threadname;

    NewThread(String name) {
        threadname = name;
        t = new Thread(this, threadname);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("From thread " + Thread.currentThread() + " i = " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class AliveJoine {
    public static void main(String[] args) {
        NewThread user1 = new NewThread("USER1");
        NewThread user2 = new NewThread("USER2");
        NewThread user3 = new NewThread("USER3");
        System.out.println("Thread USER1 IS ALIVE: " + user1.t.isAlive());
        System.out.println("Thread USER2 IS ALIVE: " + user2.t.isAlive());
        System.out.println("Thread USER3 IS ALIVE: " + user3.t.isAlive());
        user1.t.isAlive();
        try {
            user1.t.join();
            user2.t.join();
            user3.t.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
