package Lab_Program_13;

public class BubbleSort {
    public static void main(String[] args) {
        int array[]= {10,2,30,4,50,25,99};
        System.out.println("Array Elements Before Sorting");
        for (int i : array) {
            System.out.print(i+"  ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {  
                    int temp = array[j];  
                    array[j]=array[i];  
                    array[i]= temp; 
                }   
            }
        }
        System.out.println("\nArray Elements After Sorting [Ascending Order]");

        for (int i : array) {
            System.out.print(i+"  ");
            
        }
        

    }
    
}
