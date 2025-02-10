class Employee{
    int employeeid;
    String name;
    String department;
    Employee(){};
    Employee(int a,String  b,String c){
        employeeid=a;
        name=b;
        department=c;
    }
    void displayDetails(){
        System.out.println("=========Employee Details=========");
        System.out.println("Employee Id "+ employeeid);
        System.out.println("Employee Name "+name);
        System.out.println("Employee Department "+department);
    }
}
class Manager extends Employee{
    int teamsize;
    Manager(){};
    Manager(int d){
        super(123,"Keshav Abhishek","BackGate" );
        teamsize=d;
    }
    void displayDetails(){
        System.out.println("=========Employee Details=========");
        System.out.println("Employee Id : "+ employeeid);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Department : "+department);
        System.out.println("Team Size : "+teamsize);
    }
}

public class EmpInheritance {
    public static void main(String[] args) {
        Manager keshav= new Manager(69);
        keshav.displayDetails();
        
    }
    
}
