/**
 * ==========================================================
 * Program Name: AirIndia
 * Description : Function Overriding
 * Author      : Nihal Kumar
 * Created On  : 10-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package Lab_Program_3;
class FlightTicket{
    String ticketnumber;
    String passengername;
    Double basefare;
    FlightTicket(){};
    FlightTicket(String ticketnumber, String passengername,Double basefare){
        this.ticketnumber=ticketnumber;
        this.passengername=passengername;
        this.basefare=basefare;
    };

    void calculateTotalFare(){
        System.out.println("==============Ticket Details==============");
        System.out.println("Ticket Number : "+ticketnumber);
        System.out.println("Passenger Name : "+passengername);
        System.out.println("Basefare will be calculated based on Class ");
        System.out.println("Keep Patience");

    }
}

class EconomyTicket extends FlightTicket {
    EconomyTicket(String ticketnumber, String passengername, Double basefare) {
        super(ticketnumber, passengername, basefare);
    }

    @Override
    void calculateTotalFare() {
        System.out.println("==============Economy Class Ticket Details==============");
        System.out.println("Ticket Number : " + ticketnumber);
        System.out.println("Passenger Name : " + passengername);
        System.out.println("Basefare: " + basefare);
        System.out.println("Total Fare: " + (basefare - (basefare * 0.1))); 
    }
}
class BusinessClassTicket extends FlightTicket {
    BusinessClassTicket(String ticketnumber, String passengername, Double basefare) {
        super(ticketnumber, passengername, basefare);
    }

    @Override
    void calculateTotalFare() {
        System.out.println("==============Business Class  Ticket Details==============");
        System.out.println("Ticket Number : " + ticketnumber);
        System.out.println("Passenger Name : " + passengername);
        System.out.println("Basefare: " + basefare);
        System.out.println("Total Fare: " + (basefare + (basefare * 0.2))); 
    }
}

class FirstClassTicket extends FlightTicket {
    FirstClassTicket(String ticketnumber, String passengername, Double basefare) {
        super(ticketnumber, passengername, basefare);
    }

    @Override
    void calculateTotalFare() {
        System.out.println("==============First Class  Ticket Details==============");
        System.out.println("Ticket Number : " + ticketnumber);
        System.out.println("Passenger Name : " + passengername);
        System.out.println("Basefare: " + basefare);
        System.out.println("Total Fare: " + (basefare + (basefare * 0.5))); 
    }
}
public class AirIndia {
    public static void main(String[] args) {
        EconomyTicket E1= new EconomyTicket("E600000001", "Mukesh Ambani", 9200.0);
        E1.calculateTotalFare();
        BusinessClassTicket B1 =new BusinessClassTicket("B60000001", "Devi Chitralekha", 13500.0);
        B1.calculateTotalFare();
        FirstClassTicket F1 = new FirstClassTicket("F60000001", "Dhirendra Shastri", 23000.0);
        F1.calculateTotalFare();
 
    }  
}
