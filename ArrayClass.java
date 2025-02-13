import java.util.Scanner;

/**
 * ==========================================================
 * Program Name: ArrayClass
 * Description : 1-D arrays
 * Author      : Nihal Kumar
 * Created On  : 10-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
// an Array is a collection of Homogeneous elements 
// int d[];
// int[]d;
// int[] d;  
import java.util.*;
public class ArrayClass {
    public int sum_of_elements(int a[]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        return sum;
    }
    public int[] even_odd_sum(int a[]){
        int odd_sum=0;
        int even_sum=0;
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
                even_sum=even_sum+a[i];
            }else{
                odd_sum=odd_sum+a[i];
            }
            
        }
        return new int[]{even_sum,odd_sum};
    }
    public Boolean find_key(int a[],int key){
        for(int i: a){
            if(i==key){
                return true;
            }
        }
        return false;
    }
    public int key_element_count(int a[],int key){
        int count=0;
        for(int element: a){
            if(element==key){
                count++;
            }

        }
        return count;
    }
    public int largest_element(int a[]){
        int largest= a[0];
        for(int element: a){
            if(element>largest){
                largest=element;
            }
        }
        return largest;
    }
    public int smallest_element(int a[]){
        int smallest= a[0];
        for(int element: a){
            if(element<smallest){
                smallest=element;
            }
        }
        return smallest;
    }
    public int[] copytoAnother(int a[],int b[]){
        for (int i = 0; i < b.length; i++) {
            b[i]=a[a.length-1-i];
            
        }
        return b;
    }

    public static void main(Strings[] args) {
        int a[]= new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        System.out.print("Array A contains Elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+ a[i]);
        }
        System.out.println("\nAnother W0ay to print ");

        for(int i: a){
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter Number of Elements :");
        num= sc.nextInt();
        int marks[]= new int[num];
        int marks2[]= new int[num];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Marks Arrays Elements are : ");
        for(int element :marks){
            System.out.print(element+" ");
        }
        System.out.println("\n\nFunction Function\n\n");
        ArrayClass array_test = new ArrayClass();
        System.out.println("Sum of elements of marks array is: "+array_test.sum_of_elements(marks));
        System.out.println("Sum of elements at even index is : "+ array_test.even_odd_sum(marks)[0]);
        System.out.println("Sum of elements at Odd index is : "+ array_test.even_odd_sum(marks)[1]);
        int key;
        System.out.print("Enter key to find in marks array: " );
        key=sc.nextInt();
        System.out.println("Element "+key+" Found : "+ array_test.find_key(marks, key));
        System.out.println("No of Occurence of "+ key +" is : "+array_test.key_element_count(marks, key));
        System.out.println("Largest Element in marks array is :"+ array_test.largest_element(marks));
        System.out.println("Smallest Element in marks array is :"+ array_test.smallest_element(marks));
        System.out.println("Coping element to one to another : "+array_test.copytoAnother(marks, marks2));
        for(int ele: marks2){
            System.out.print(" "+ ele);
        }


        
    }
    
}
