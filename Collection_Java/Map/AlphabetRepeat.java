package Collection_Java.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class AlphabetRepeat {
    public static void main(String[] args) {
        LinkedHashMap <Character, Integer> list = new LinkedHashMap<>();
        String message = "Good bye to CVRGU";
        for (Character m : message.toCharArray()) {
            if(m==' '){
                continue;
            }
            else{

                if (list.containsKey(m)==true) {
                    list.put(m, list.get(m)+1);
                    
                }else {
                    list.put(m,1);
                    
                }
            }   
        }
        for(HashMap.Entry<Character,Integer> m : list.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    } 
}