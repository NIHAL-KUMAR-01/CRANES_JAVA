package Priority_Queue;

import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    int rank;
    String name;
    public Student(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }
    @Override
    public int compareTo(Student s){
        return this.rank-s.rank;
    }

    @Override
    public String toString(){
        return name+" "+"( "+ rank+" )";
    }

}

public class ComparableDemo {
    public static void main(String[] args) {
        PriorityQueue <Student> data = new PriorityQueue<>();
        Student s1 = new Student(10, "Keshav");
        Student s2 = new Student(30, "Ram");
        Student s3 = new Student(50, "Rahul");
        Student s4 = new Student(1, "Geeta");
        data.offer(s1);
        data.offer(s2);
        data.offer(s3);
        data.offer(s4);
        System.out.println(data);
        
    }
   


}
