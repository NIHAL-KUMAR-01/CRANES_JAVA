class Vehicle{
    Strings make;
    Strings model;
    int year;
    Vehicle(){};
    Vehicle(Strings a,Strings b,int c){
        make=a;
        model=b;
        year=c;
    }
    void displayInfo(){
        System.out.println("=====Vehicle Details=====");
        System.out.println("Moke : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
    }
}
class Car extends Vehicle{
    int numberofDoors;
    int trunkCapacity;
    Car(){};
    Car(int a,int b){
        super("Tata","Nano ",2019);
        numberofDoors =a;
        trunkCapacity=b;
        
    }
    void displayInfo(){
        System.out.println("=====Vehicle Details=====");
        System.out.println("Moke : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Number of Doors  : "+numberofDoors);
        System.out.println("Trunk capacity : "+trunkCapacity);

    }
}

public class Vehicle_Inheritance {
    public static void main(Strings[] args) {
        // System.out.println("Hello");
        Car tata=new Car(4, 25);
        tata.displayInfo();

    }
    
}
