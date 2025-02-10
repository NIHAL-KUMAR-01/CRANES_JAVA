/**
 * ==========================================================
 * Program Name: EmployeeData
 * Description : Array of Objects 
 * Author      : Nihal Kumar
 * Created On  : 08-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
import java.util.*;
class Employee{
    int emp_id;
    String emp_name;
    Scanner sc= new Scanner(System.in);

    Employee(){};
    Employee(int emp_id, String emp_name){
        this.emp_id=emp_id;
        this.emp_name=emp_name;

    }

    void addemp(Employee emp[]){
        int id;
        String name;
        for (int i = 0; i < emp.length; i++) {
            System.out.print("Enter Employee Id: ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name:");
            name=sc.nextLine();
            emp[i]=new Employee(id,name);

        }
    }
    void display(Employee emp[]){
        System.out.println("\n===============:Display All Employee Information:===============\n");
        for(Employee e : emp){
            System.out.println("Employee id :"+ e.emp_id);
            System.out.println("Employee  Name:"+ e.emp_name);
        }
    }
    void search(Employee emp[]){
        int target_id;
        System.out.print("Emter emp id to Search: ");
        target_id= sc.nextInt();
        sc.nextLine();
        for(Employee e : emp){
            if(e.emp_id==target_id){
                System.out.println("Data Found !!");
                System.out.println("Employee Id"+e.emp_id);
                System.out.println("Employee Name"+e.emp_name);
            }
        }
    }
    void update(Employee emp[]){
        int target_id;
        int flag=0;
        String up_name;
        System.out.println("Enter Employee_id to Alter Details: ");
        target_id=sc.nextInt();
        // sc.nextLine();
        for(Employee e: emp){
            if(e.emp_id==target_id){
                System.out.println("Match Found !!");
                System.out.println("Enter New Name to Update: ");
                sc.nextLine();
                up_name=sc.nextLine();
                e.emp_name=up_name;
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Employee Not Found / Incorrect Emp Id");
        }
    }

}

public class EmployeeData {
    public static void main(String[] args) {
        Employee emp[] = new  Employee[2];
        Employee e = new Employee();
        e.addemp(emp);
        e.display(emp);
        e.search(emp); 
        e.update(emp);
        e.display(emp);    
    }
    
}
