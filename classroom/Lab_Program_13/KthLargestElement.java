package Lab_Program_13;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        int array[]= {10,2,5,6,85,62,25};
        Arrays.sort(array);
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.print("Enter K for finding Kth largest No : ");
        k=sc.nextInt();
        System.out.println("Kth Largest element is: "+ array[array.length-k]);

    }
    
}
