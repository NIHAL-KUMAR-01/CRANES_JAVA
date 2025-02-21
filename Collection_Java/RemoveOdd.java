package Collection_Java;

import java.util.ArrayList;

public class RemoveOdd {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(32);
        list.add(27);

        list.removeIf(n->(n%2)!=0);
        System.out.println(list);
    }
    
}
