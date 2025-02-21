package Lab_Program_11;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before Swapping ");
        System.out.println(list);

        for (int i = 0; i < list.size() / 2; i++) {  
            int temp = list.get(i);
            int swapIndex = list.size() - i - 1;
            
            list.set(i, list.get(swapIndex));
            list.set(swapIndex, temp);
        }

        System.out.println("After Swapping ");
        System.out.println(list);

        
    }
    
}
