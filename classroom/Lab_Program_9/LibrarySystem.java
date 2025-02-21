package Lab_Program_9;
/**
 * ==========================================================
 * Program Name: LibrarySystem
 * Description : MultiThredaing race condition
 * Author      : Nihal Kumar
 * Created On  : 19-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class Library implements Runnable {
    private int availableBooks;

    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    public void borrowBook() {
        if (availableBooks > 0) {
            System.out.println(Thread.currentThread()+ " is trying to borrow a book.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            availableBooks--;
            System.out.println(Thread.currentThread()+ " borrowed a book. Remaining books: " + availableBooks);
        } else {
            System.out.println(Thread.currentThread() + " failed to borrow a book. No books left.");
        }
    }

    public void run() {
        borrowBook();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library(2); 

        Thread t1 = new Thread(library, "User1");
        Thread t2 = new Thread(library, "User2");
        Thread t3 = new Thread(library, "User3");

        t1.start();
        t2.start();
        t3.start();
    }
}
