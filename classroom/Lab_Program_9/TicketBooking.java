package Lab_Program_9;
/**
 * ==========================================================
 * Program Name: TicketBooking
 * Description : MultipleThreading based question
 * Author      : Nihal Kumar
 * Created On  : 19-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class Ticket implements Runnable {
    int no_of_tickets;

    Ticket() {
    };

    Ticket(int no_of_tickets) {
        this.no_of_tickets = no_of_tickets;
    };

    public void book_ticket(int num) {
        try {
            if (no_of_tickets >= num) {
                System.out.println("Ticket Trying to Book " + Thread.currentThread());
                Thread.sleep(1000);

                System.out.println("Ticket booked  " + num + " Nos " + Thread.currentThread());

                no_of_tickets = no_of_tickets - num;

                try {
                    if (no_of_tickets > 0) {
                        System.out.println("Available Ticket : " + no_of_tickets);

                    } else {
                        throw new Exception("!!!Ticket Sold !!!");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                throw new Exception("Ticket is Insufficient");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void run() {
        book_ticket(1);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Ticket counter = new Ticket(1);
        Thread t1 = new Thread(counter, "User1");
        Thread t2 = new Thread(counter, "User2");
        Thread t3 = new Thread(counter, "User3");
        t1.start();
        t2.start();
        t3.start();

    }

}
