package Collection_Java;

import java.util.ArrayList;

public class NumberProgram {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        int count = 0;
        input.add(10);
        input.add(20);
        input.add(60);
        input.add(10);
        input.add(50);
        input.add(160);
        input.add(100);
        input.add(10);
        input.add(20);
        int target = 10;

        for (Integer integer : input) {
            if (integer == target) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The Key " + target + " is present " + count + " times");

        }else{
            System.out.println(target +" is Not Found");
        }
    }


}