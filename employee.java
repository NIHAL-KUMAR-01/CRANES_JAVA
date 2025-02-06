import java.util.*;

class employee_details{
    long emp_id;
    String emp_name;
    String emp_designation;
    long emp_salary;
    String emp_department;

    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        emp_id=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
        emp_name= sc.nextLine();
        System.out.print("Enter Employee Designation : ");
        emp_designation= sc.nextLine();
        System.out.print("Enter Employee Salary : ");
        emp_salary= sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Employee Department : ");
        emp_department=sc.nextLine();
    }
    void display(){
        System.out.println("==========Employee Details==========");
        System.out.println("Employee Id : "+emp_id);
        System.out.println("Employee Name : "+ emp_name);
        System.out.println("Employee Designation : "+emp_designation);
        System.out.println("Employee Salary : "+emp_salary);
        System.out.println("Employee Department : "+ emp_department);
    }
}
public class employee{
    public static void main(String args[]){
        employee_details emp = new employee_details();
        emp.read();
        emp.display();

    }
}
