package Collection_Java;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.addFirst(5);
        System.out.println(list);
        list.addLast(25);
        
    }
    
}
