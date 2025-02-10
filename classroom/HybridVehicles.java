/**
 * ==========================================================
 * Program Name: HybridVehicles
 * Description : Multiple Inheritance (Interface)
 * Author      : Nihal Kumar
 * Created On  : 08-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class HybridVehicles {
    public static void main(String[] args) {
        
    }
}

 interface FuelVehicle {
    void refuel(double liters);
    void startEngine();
}

interface ElectricVehicle {
    void chargeBattery(double amount);
    void startElectricMotor();
}

class HybridVehicle implements FuelVehicle, ElectricVehicle {

    HybridVehicle() {}

    @Override
    public void refuel(double liters) {
        System.out.println("Refueling with " + liters + " liters of fuel.");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting fuel engine...");
    }

    @Override
    public void chargeBattery(double amount) {
        System.out.println("Charging battery with " + amount + " kWh.");
    }

    @Override
    public void startElectricMotor() {
        System.out.println("Starting electric motor...");
    }
}

public class HybridVehicles{
    public static void main(String[] args) {
        HybridVehicle hybridCar = new HybridVehicle();
        hybridCar.refuel(20);
        hybridCar.startEngine();
        hybridCar.chargeBattery(15);
        hybridCar.startElectricMotor();
    }
}
