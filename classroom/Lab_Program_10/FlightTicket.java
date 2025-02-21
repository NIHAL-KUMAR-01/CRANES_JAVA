package Lab_Program_10;
/**
 * ==========================================================
 * Program Name: FlightTicket
 * Description : Multithreading Concept
 * Author      : Nihal Kumar
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */


import java.util.ArrayList;
import java.util.stream.IntStream;

class Ticket implements Runnable {
    ArrayList<String> seat_no = new ArrayList<String>();

    Ticket() {
        IntStream.rangeClosed(1, 3).forEach(i -> seat_no.add("A" + i));
        System.out.println(seat_no);
    };

    public void run() {
        bookTicket();
    }

    public synchronized void bookTicket() {

        try {
            if (!seat_no.isEmpty()) {
                String bookedSeat = seat_no.remove(0);
                System.out.println(Thread.currentThread().getName() + " booked seat: " + bookedSeat);
                System.out.println("Available Tickets : "+seat_no);
            } else {
                throw new Exception("No Seats Available ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class FlightTicket {
    public static void main(String[] args) {
        Ticket user = new Ticket();
        Thread t1 = new Thread(user, "Keshav Abhishek");
        Thread t2 = new Thread(user, "Sourav Rout");
        Thread t3 = new Thread(user, "Ankita Kumari");
        Thread t4 = new Thread(user, "Ankit Kumar");
        // Thread t5 = new Thread(user, "");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        

    }

}
