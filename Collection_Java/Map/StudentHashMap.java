package Collection_Java.Map;

import java.util.HashMap;

class Student{
    HashMap <String,String> studentdata;
    Student(){
        studentdata= new HashMap<>();
    }

    public void addStudent(String name, String grade){
        studentdata.put(name, grade);
        System.out.println("Student "+ name +" is added Successfully");
    }

    public void removestudent(String name){// name grade
        for(String a: studentdata.keySet()){
            if (a.equalsIgnoreCase(name)) {
                studentdata.remove(a);
                System.out.println("Removed Successfuly");
            }
        }
    }

    public void updategrade(String name){
        for (String i : studentdata.keySet()) {
            if (i.equalsIgnoreCase(name)) {
                studentdata.replace(i,studentdata.get(i).concat("+"));   
            }  
        }
    }

    public void displayhash(){
        for(HashMap.Entry<String,String> m : studentdata.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

public class StudentHashMap {
    public static void main(String[] args) {
        Student user = new Student();
        user.addStudent("Nihal", "A");
        user.addStudent("Keshav", "B");
        user.addStudent("Ankit", "C");
        user.addStudent("Aman", "A");
        user.displayhash();
        user.removestudent("NIHAL");
        user.displayhash();
        user.updategrade("Ankit");
        user.displayhash();
    }
    
}
