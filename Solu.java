import java.util.Scanner;

public class Solu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking weight and height input
        System.out.print("Enter Weight in kg: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter Height in meters: ");
        double height = sc.nextDouble();
        
        // Calculating BMI
        double BMI = (weight * 10000) / (height * height);
        
        System.out.printf("Your BMI is %.2f.\n", BMI);
        
        if (BMI < 18.5) {
            double gainWeight = (18.5 * height * height) - weight;
            System.out.println("You are underweight.");
            System.out.printf("Gain %.2f kg to be fit.\n", gainWeight);
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You are fit and healthy.");
        } else {
            double reduceWeight = weight - (24.9 * height * height);
            System.out.println("You are overweight.");
            System.out.printf("Reduce %.2f kg to be fit.\n", reduceWeight);
        }
        
        sc.close();
    }
}
