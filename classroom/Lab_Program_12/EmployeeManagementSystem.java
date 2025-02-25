package Lab_Program_12;
/**
 * ==========================================================
 * Program Name: EmployeeManagementSystem
 * Description : ArrayList based Question
 * Author      : Nihal Kumar
 * Created On  : 22-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;

class EmployeeDetails {
    int empid;
    String empname;
    String empDepartment;
    int empsalary;

    public EmployeeDetails() {
    }

    public EmployeeDetails(int empid, String empname, String empDepartment, int empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empDepartment = empDepartment;
        this.empsalary = empsalary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public int getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empid + ", Name: " + empname +
                ", Department: " + empDepartment + ", Salary: " + empsalary;
    }

}

class EmployeeDatabase {
    ArrayList<EmployeeDetails> edatabase;

    EmployeeDatabase() {
        edatabase = new ArrayList<>();
    }

    public void addemployee(EmployeeDetails e1) {
        edatabase.add(e1);
        System.out.println("Employee : " + e1.getEmpname() + " added Successfully");
    }

    public void removeemployee(int empid) {
        // edatabase.removeIf(n-> n.getEmpid()==empid);
        edatabase.removeIf(n -> {
            if (n.getEmpid() == empid) {
                System.out.println("Deleting Employee Details having Emp name : " + n.getEmpname());
                return true;
            }
            return false;
        });

    }

    public void displayemployee() {
        System.out.println("-----------------: Displaying Employee Details :-----------------");
        for (EmployeeDetails employeeDetails : edatabase) {
            if ((employeeDetails.getEmpsalary() > 50000)
                    && (employeeDetails.getEmpDepartment().equalsIgnoreCase("CSE"))) {
                System.out.println(employeeDetails);

            }
        }
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeDatabase d1 = new EmployeeDatabase();
        EmployeeDetails e1 = new EmployeeDetails(1, "Raghav Goel ", "CSE", 50200);
        EmployeeDetails e2 = new EmployeeDetails(2, "Amit Sharma", "IT", 55000);
        EmployeeDetails e3 = new EmployeeDetails(3, "Neha Verma", "HR", 48000);
        EmployeeDetails e4 = new EmployeeDetails(4, "Suresh Nair", "Finance", 62000);
        EmployeeDetails e5 = new EmployeeDetails(5, "Pooja Iyer", "Marketing", 53000);
        EmployeeDetails e6 = new EmployeeDetails(6, "Vikram Singh", "CSE", 60000);
        EmployeeDetails e7 = new EmployeeDetails(7, "Anjali Patil", "Sales", 51000);
        EmployeeDetails e8 = new EmployeeDetails(8, "Rajesh Gupta", "Customer Support", 47000);
        EmployeeDetails e9 = new EmployeeDetails(9, "Meera Joshi", "Research & Development", 65000);
        EmployeeDetails e10 = new EmployeeDetails(10, "Arjun Kapoor", "CSE", 58000);
        EmployeeDetails e11 = new EmployeeDetails(11, "Ishita Banerjee", "Administration", 49000);

        d1.addemployee(e1);
        d1.addemployee(e2);
        d1.addemployee(e3);
        d1.addemployee(e4);
        d1.addemployee(e5);
        d1.addemployee(e6);
        d1.addemployee(e7);
        d1.addemployee(e8);
        d1.addemployee(e9);
        d1.addemployee(e10);
        d1.addemployee(e11);

        d1.displayemployee();
        d1.removeemployee(1);
        d1.displayemployee();

    }

}
