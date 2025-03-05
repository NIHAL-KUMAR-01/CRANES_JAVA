package Collection_Java.Map;

import java.util.HashMap;

/*
 * Task:
 * Use HashMap to map the faculty id with subname
 * 101   C
 * 102   CPP
 * 103  JAVA
 * 104  C
 */
public class PracticeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();
        list.put(101, "C");
        list.put(102, "Cpp");
        list.put(103, "Java");
        list.put(104, "C");
        String target = "C";
        int count = 0;
        for (String value : list.values()) {
            if (value.equalsIgnoreCase(target)) {
                count++;
                System.out.println();
            }
        }

        System.out.println("Faculty taking " + target + " Subject is : " + count);

        for (HashMap.Entry<Integer, String> m : list.entrySet()) {
            if (m.getValue().equalsIgnoreCase(target)) {
                System.out.println(m.getKey() + " " + m.getValue());

            }
        }

    }

}
