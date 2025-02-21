package Collection_Java;

import java.util.ArrayList;
import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListIntegerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        // System.out.println(list.get(4));
        // list.add(2, 40);
        // System.out.println(list);
        // System.out.println(list.size());
        System.out.println("List elements are : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println("Using Enhanced for loop .........List elements are : ");
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("Using Iterator.....");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
