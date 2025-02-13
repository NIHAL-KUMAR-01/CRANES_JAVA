class Employee{
    int employeeid;
    Strings name;
    Strings department;
    Employee(){};
    Employee(int a,Strings  b,Strings c){
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
    public static void main(Strings[] args) {
        Manager keshav= new Manager(69);
        keshav.displayDetails();
        
    }
    
}
