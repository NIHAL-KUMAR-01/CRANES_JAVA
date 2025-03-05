package Collection_Java.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyHashMap {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,2));

        HashMap <Integer,Integer> hashlist = new HashMap<>();
        for (int integer : list) {
            if (hashlist.containsKey(integer)){
                hashlist.put(integer, hashlist.get(integer)+1);  
            }else{
                hashlist.put(integer, 1);
            }
            
        }
        System.out.println(hashlist);

        
    }
    
}
