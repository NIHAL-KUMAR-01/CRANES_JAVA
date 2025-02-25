package Collection_Java.Map;
import java.util.*;


public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap <Integer,String> studentname = new HashMap<>();
        studentname.put(1,"Keshav");
        studentname.put(2,"Abhishek");
        studentname.put(3,"Ram");
        studentname.put(4,"Sourav");
        studentname.put(5,"Ankita");
        studentname.put(6,"Rakesh");
        studentname.put(1,"Raghav"); // 1 changes means replaced 

        System.out.println(studentname.size());
        System.out.println(studentname);

        System.out.println(studentname.get(2));// abhishek 
        System.out.println(studentname.get(1));// raghav
        
        System.out.println(studentname.containsKey(5));

        studentname.remove(4);
        System.out.println(studentname);

        studentname.replace(5, "Ankit Kumari");
        System.out.println(studentname);

        studentname.replace(5, "Ankit Kumari", "aNKIT KUMAR");
        System.out.println(studentname);
        System.out.println(studentname.keySet());
        System.out.println(studentname.values());
    }
    
}
