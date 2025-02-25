import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int temp = sc.nextInt();
            list.add(temp);
        }
        int choice = sc.nextInt();
        int i = 0;
        while (i < 2) {
            String perform = sc.nextLine();

            if (perform.equalsIgnoreCase("Insert")) {
                int pos = sc.nextInt();
                int temp = sc.nextInt();
                list.add(pos, temp);

            } else if (perform.equalsIgnoreCase("Delete")) {
                int pos = sc.nextInt();
                list.remove(pos);

            }

            i++;

        }
        for (int integer : list) {
            System.out.print(integer + " ");

        }

    }
}