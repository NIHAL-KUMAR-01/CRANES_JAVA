/**
 * ==========================================================
 * Program Name: SmartphoneTest
 * Description : 
 * Author      : Nihal Kumar
 * Created On  : 08-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

interface Phone {
    void makeCall(String phoneNumber);
    void sendMessage(String phoneNumber, String message);
}

interface Camera {
    void takePhoto();
    void recordVideo(int duration);
}

class Smartphone implements Phone, Camera {
    
    Smartphone() {};
    
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }
    
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }

    public void takePhoto() {
        System.out.println("Photo captured successfully!");
    }
    
    public void recordVideo(int duration) {
        System.out.println("Recording video for " + duration + " seconds...");
    }
}

public class SmartPhones {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        myPhone.makeCall("+91-9876543210");
        myPhone.sendMessage("+91-9876543210", "Hello, how are you?");
        myPhone.takePhoto();
        myPhone.recordVideo(10);
    }
}
