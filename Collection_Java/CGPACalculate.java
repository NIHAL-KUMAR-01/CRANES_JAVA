package Collection_Java;
import java.util.ArrayList;
import java.util.Scanner;

class calculateData{
    int student_count=4;
    Scanner sc= new Scanner(System.in);

    ArrayList <Float> subject1 = new ArrayList<>();
    ArrayList <Float> subject2 = new ArrayList<>();
    ArrayList <Float> subject3 = new ArrayList<>();
    ArrayList <Float> averageCGPA = new ArrayList<>();

    public void takeinput(){
        System.out.println("Enter Data : ");
        for (int i = 0; i < student_count; i++) {
            System.out.print("Enter CGPA of Subject 1 of Student"+ (i+1)+" : " );
            Float temp=sc.nextFloat();
            subject1.add(temp);
            System.out.print("Enter CGPA of Subject 2 of Student"+ (i+1)+" : " );
            temp=sc.nextFloat();
            subject2.add(temp);
            System.out.print("Enter CGPA of Subject 3 of Student"+ (i+1)+" : " );
            temp=sc.nextFloat();
            subject3.add(temp);

        }
    }

    public void calculatedata(){
        for (int i = 0; i < student_count; i++) {
            Float temp= (subject1.get(i)+subject2.get(i)+subject3.get(i))/3;
            averageCGPA.add(temp); 
        }
    }

    public void display(){
        System.out.println(subject1);
        System.out.println(subject2);
        System.out.println(subject3);

        System.out.println(averageCGPA);
    }

}
public class CGPACalculate {
    public static void main(String[] args) {
        calculateData college = new calculateData();
        college.takeinput();
        college.calculatedata();
        college.display();
    }
    
}
