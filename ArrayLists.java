// import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        // ArrayList <String> list2 = new ArrayList<String>();
        // ArrayList <Integer> list3 = new ArrayList<Integer>();


        //add element 
        list.add(23);
        list.add(2);
        list.add(30);
        System.out.println(list);

        //get elements 
        int element =list.get(0);
        System.out.println(element);

        //add elements in array in between
        list.add(1,15);
        System.out.println(list);

        //set element phle wale se change karna 
        list.set(1,12);
        System.out.println(list);

        // delete element 
        list.remove(3);
        System.out.println(list);
        //size of array
        int size= list.size();
        System.out.println(size);



        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }

        //sorting 
        Collections.sort(list);
        System.out.println(list);
    }
    
}
