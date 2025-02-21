package Collection_Java;

import java.util.*;

public class ArrayListStringDemo {
    public static void main(String[] args) {
        ArrayList <String> boysname = new ArrayList<>();
        ArrayList <String> girlsname = new ArrayList<>();


        boysname.add("Keshav Abhishek");
        boysname.add("Ankita Kumari");
        boysname.add("Saurav Gudia");
        boysname.add("Gudia Kumar");

        System.out.println(boysname);
        boysname.set(1, "Ankit Kumar");
        System.out.println(boysname);

        for (int i = 0; i < boysname.size(); i++) {
            System.out.println(boysname.get(i));
            
        }

        for (String string : boysname) {
            System.out.println(string);
        }

        Iterator obj = boysname.iterator();
        while (obj.hasNext()) {
            System.out.println(obj.next());  
        }

        girlsname.add("Radhika Kumari");
        girlsname.add("Gudia Kumari");
        girlsname.add("Radha Kumari");
        girlsname.add("Susmitaaa Kumari");

        System.out.println("\nShowing Data");
        System.out.println("\nBoys list name");
        for (int i = 0; i < boysname.size(); i++) {
            System.out.println((i+1)+ " "+ boysname.get(i));
        }

        System.out.println("\nGirls list name");
        for (int i = 0; i < girlsname.size(); i++) {
            System.out.println((i+1)+ " "+ girlsname.get(i));
        }

        boysname.addAll(girlsname);


        System.out.println("\n=======================Final Student List:===================\n ");
        int i=1;
        for (String string : boysname) {
            System.out.println(i+ " "+ string);
            i++;
            
        }
        girlsname.clear();

        System.out.println(girlsname);


    }
    
}
