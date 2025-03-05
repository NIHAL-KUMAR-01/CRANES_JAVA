package Vector_Java_Demo;

import java.util.Vector;

public class Vector1Demo {
    Vector <Integer> list;
    Vector1Demo(){
        list= new Vector<>();
    }

    public void vectoradd(int data){
        list.add(data);
    }
    public void removedata(int data) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == data) {
                list.remove(i);
            }
        }
    }
    


    public void addatindex(int index,int data){
        list.add(index, data);
    }

    public void display(){
        for (int integer : list) {
            System.out.print(integer +" ");
            
        }
        System.out.println("\n");
    }

    public void sumofall(){
        
        int sum=0;
        for (int integer : list) {
            sum=sum+integer;
            
        }
        System.out.println("Sum is : "+sum);
    }


    public static void main(String[] args) {
        // StringBuffer name = new StringBuffer("hello");
        // System.out.println(name.capacity());
        // name.append(" World");
        // System.out.println(name);
        Vector1Demo user = new Vector1Demo();
        user.vectoradd(10);
        user.vectoradd(20);
        user.vectoradd(30);
        user.display();
        user.addatindex(1, 25);
        user.display();
        user.removedata(30);
        user.display();
        user.sumofall();
        
       
    }
    
}
