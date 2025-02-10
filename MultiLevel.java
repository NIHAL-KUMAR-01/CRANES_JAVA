class ElectronicDevice{
    String brand;
    String model;
    Double powerusage;
    ElectronicDevice(){};
    ElectronicDevice(String brand,String model,Double powerusage){
        this.brand=brand;
        this.model=model;
        this.powerusage=powerusage;
    };
    void displayDeviceInfo(){
        System.out.println("Device Details: ");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Power Usage "+powerusage);
    }

}
class SmartDevice extends ElectronicDevice{
    String connectivity;
    String os;
    SmartDevice(){};
    SmartDevice(String a,String b){
        super("Google Pixel ","7A",12.0);
        connectivity=a;
        os=b;
    };
    void displayDeviceInfo(){
        System.out.println("Device Details: ");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Power Usage "+powerusage);
        System.out.println("Connectivity "+connectivity);
        System.out.println("Operating System "+os );
    }
}
class SmartPhone extends SmartDevice{
    Double cameraresolution;
    int batterycapacity;
    SmartPhone(){};
    SmartPhone(Double a, int b){
        super("5G/4G/Bluetooth 5.0 ","Windows");
        cameraresolution=a;
        batterycapacity=b;
    };
    void displayDeviceInfo(){
        System.out.println("Device Details: ");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Power Usage : "+powerusage);
        System.out.println("Connectivity : "+connectivity);
        System.out.println("Operating System "+os );
        System.out.println("Camera Resolution "+cameraresolution);
        System.out.println("Battery Capacity "+batterycapacity);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        SmartPhone Pixel= new SmartPhone(50.25,5000);
        Pixel.displayDeviceInfo();
        
    }
    
}
