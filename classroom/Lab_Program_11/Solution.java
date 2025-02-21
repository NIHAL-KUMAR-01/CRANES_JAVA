package Lab_Program_11;

import java.util.Scanner;

class Student {
    private int studentid;
    private String studentname;
    private String studentaddress;
    private String collegename;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    Student(int studentid, String studentname, String studentaddress, String collegename) {
        setStudentid(studentid);
        setStudentname(studentname);
        setStudentaddress(studentaddress);
        setCollegename(collegename);
    }

    Student(int studentid, String studentname, String studentaddress) {
        setStudentid(studentid);
        setStudentname(studentname);
        setStudentaddress(studentaddress);
        setCollegename("NIT");
    }

    public void display() {
        System.out.println("Student id : " + getStudentid());
        System.out.println("Student name : " + getStudentname());
        System.out.println("Address : " + getStudentaddress());
        System.out.println("College name : " + getCollegename());
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        String address;
        String collegecheck;
        System.out.print("Enter Student's id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student's name: ");
        name = sc.nextLine();
        System.out.print("Enter Collge's address: ");
        address = sc.nextLine();
        while (true) {
            System.out.print("whether the student is from NIT (Yes/No): ");
            collegecheck = sc.nextLine();
            if (collegecheck.equalsIgnoreCase("Yes")) {
                Student s1 = new Student(id, name, address);
                s1.display();
                break;

            } else if (collegecheck.equalsIgnoreCase("No")) {
                String Collegename;
                System.out.println("Enter the college name");
                Collegename = sc.nextLine();
                Student s1 = new Student(id, name, address, Collegename);
                s1.display();
                break;
            } else {
                System.out.println("Wrong input");
            }

        }

    }

}
