package Lab_Program_13;

import java.util.ArrayList;

public class LongestSubsequence {
    public static void main(String[] args) {
        int array[]= {10,8,20,2,50,60,3,80,90,1};
        ArrayList<Integer> sequence = new ArrayList<>();
                int temp = array[0];

                sequence.add(temp);

                for (int i = 1; i < array.length; i++) {
                    if (array[i] > array[i - 1]) {
                        sequence.add(array[i]);
                    }
                }
                System.out.println(sequence);
    }
    
}
