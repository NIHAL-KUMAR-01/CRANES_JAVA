package Lab_Program_14;

import java.util.LinkedHashSet;

public class UniqueCharacter {
    public static void main(String[] args) {
        String message = "hello"; 

        LinkedHashSet<Character> list = new LinkedHashSet<>();

        for (char c : message.toCharArray()) {
            list.add(c);
        }

        if (message.length() == list.size()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
