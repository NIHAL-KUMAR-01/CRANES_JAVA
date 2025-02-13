/**
 * ==========================================================
 * Program Name: MovieTicketBooking
 * Description : Overriding Concept
 * Author      : Nihal Kumar
 * Created On  : 10-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */


package Lab_Program_3;

class MovieTicket {
    String ticketId;
    String movieName;
    double basePrice;
    
    MovieTicket() {}
    
    MovieTicket(String ticketId, String movieName, double basePrice) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.basePrice = basePrice;
    }
    
    void calculateFinalPrice() {
        System.out.println("============== Ticket Details ==============");
        System.out.println("Ticket ID : " + ticketId);
        System.out.println("Movie Name : " + movieName);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Final Price will be calculated based on ticket type");
    }
}

class StandardTicket extends MovieTicket {
    StandardTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }
    
    @Override
    void calculateFinalPrice() {
        System.out.println("============== Standard Ticket Details ==============");
        System.out.println("Ticket ID : " + ticketId);
        System.out.println("Movie Name : " + movieName);
        System.out.println("Final Price: " + basePrice);
    }
}

class PremiumTicket extends MovieTicket {
    PremiumTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }
    
    @Override
    void calculateFinalPrice() {
        System.out.println("============== Premium Ticket Details ==============");
        System.out.println("Ticket ID : " + ticketId);
        System.out.println("Movie Name : " + movieName);
        System.out.println("Final Price: " + (basePrice + (basePrice * 0.25)));
    }
}

class VIPTicket extends MovieTicket {
    VIPTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }
    
    @Override
    void calculateFinalPrice() {
        System.out.println("============== VIP Ticket Details ==============");
        System.out.println("Ticket ID : " + ticketId);
        System.out.println("Movie Name : " + movieName);
        System.out.println("Final Price: " + (basePrice + (basePrice * 0.50))); 
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        StandardTicket S1 = new StandardTicket("S1001", "Stree 2", 99.0);
        S1.calculateFinalPrice();
        PremiumTicket P1 = new PremiumTicket("P2001", "Koi mil gyaaaaaaaaaaaa", 452.0);
        P1.calculateFinalPrice();
        VIPTicket V1 = new VIPTicket("V3001", "Pushpa 2", 965.0);
        V1.calculateFinalPrice();
    }
}
