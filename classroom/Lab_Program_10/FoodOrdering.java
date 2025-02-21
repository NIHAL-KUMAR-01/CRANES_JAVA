package Lab_Program_10;
/**
 * ==========================================================
 * Program Name: FoodOrdering
 * Description : Multithreading concept
 * Author      : Nihal Kumar
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */


import java.util.ArrayList;

class Food implements Runnable {
    private final ArrayList<String> foodMenu = new ArrayList<>();
    private static int orderCount = 0; 

    Food() {
        foodMenu.add("MaalPua + Dahi");
        foodMenu.add("Biriyani + Raita");
        foodMenu.add("Masala Dosa + Sambhar + Chutney");
        foodMenu.add("Plain Dosa + Chutney");

        System.out.println("\n🍽 RRR Ramoji Restaurant Evening Menu 🍽");
        for (int i = 0; i < foodMenu.size(); i++) {
            System.out.println((i + 1) + ". " + foodMenu.get(i));
        }
        System.out.println("----------------------------------------");
    }

    synchronized public void orderFood(String customerName, int foodIndex) {
        if (foodIndex < 1 || foodIndex > foodMenu.size()) {
            System.out.println(customerName + " tried to order an invalid item.");
            return;
        }

        System.out.println(customerName + " placed an order for: " + foodMenu.get(foodIndex - 1));
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("✅ " + foodMenu.get(foodIndex - 1) + " is ready for " + customerName);
    }

    @Override
    public void run() {
        
    }
}

public class FoodOrdering {
    public static void main(String[] args) {
        Food restaurant = new Food();

        Thread customer1 = new Thread(() -> restaurant.orderFood("Customer 1", 1));
        Thread customer2 = new Thread(() -> restaurant.orderFood("Customer 2", 2));
        Thread customer3 = new Thread(() -> restaurant.orderFood("Customer 3", 3));
        Thread customer4 = new Thread(() -> restaurant.orderFood("Customer 4", 4));

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();

        try {
            customer1.join();
            customer2.join();
            customer3.join();
            customer4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAll orders have been processed!");
    }
}
