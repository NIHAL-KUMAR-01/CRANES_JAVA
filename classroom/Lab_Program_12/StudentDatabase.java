package Lab_Program_12;
/**
 * ==========================================================
 * Program Name: StudentDatabase
 * Description : ArrayList based questions 
 * Author      : Nihal Kumar
 * Created On  : 22-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;

class Student {
    int studentid;
    String studentname;
    String studentdept;
    Double CGPA;

    public Student() {
    }

    public Student(int studentid, String studentname, String studentdept, Double CGPA) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentdept = studentdept;
        this.CGPA = CGPA;

    }

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

    public String getStudentdept() {
        return studentdept;
    }

    public void setStudentdept(String studentdept) {
        this.studentdept = studentdept;
    }

    public Double getCGPA() {
        return CGPA;
    }

    public void setCGPA(Double CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentid + ", Name: " + studentname +
                ", Department: " + studentdept + ", CGPA: " + CGPA;
    }

}

class StudentSystem {
    ArrayList<Student> data;

    StudentSystem() {
        data = new ArrayList<>();
    }

    public void addstudent(Student s1) {
        data.add(s1);
        System.out.println("Student : " + s1.getStudentname() + " is added Successfully");
    }

    public void removestudent(int id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getStudentid() == id) {
                System.out.println("Student :" + data.get(i).getStudentname() + "is Removed ");
                data.remove(i);
            }
        }
    }

    public void searchstudent(String name) {
        System.out.println("\nSearching for Record having student name : "+name );
        for (Student student : data) {
            if (student.getStudentname().equalsIgnoreCase(name)) {
                System.out.println(student);
            }
        }
    }

    public void displaystudents() {
        System.out.println("\n==========:Displaying All Student Data:==========");
        for (Student student : data) {
            System.out.println(student);
        }
    }

}

public class StudentDatabase {
    public static void main(String[] args) {
        StudentSystem CGU = new StudentSystem();
        Student s1 = new Student(12, "Keshav Abhishek", "Pavillion", 6.0);
        Student s2 = new Student(13, "Aryan Sharma", "Computer Science", 8.5);
        Student s3 = new Student(14, "Priya Verma", "Electronics", 8.2);
        Student s4 = new Student(15, "Rahul Nair", "Mechanical", 7.9);
        Student s5 = new Student(16, "Sneha Patil", "Civil", 8.1);
        Student s6 = new Student(17, "Vikram Singh", "Electrical", 7.8);
        Student s7 = new Student(18, "Ananya Iyer", "Biotechnology", 8.3);
        Student s8 = new Student(19, "Rohan Das", "Information Technology", 8.0);
        Student s9 = new Student(20, "Meera Joshi", "Chemical", 7.6);
        Student s10 = new Student(21, "Aditya Kapoor", "Aerospace", 8.7);
        Student s11 = new Student(22, "Vikram SINGH", "Data Science", 9.0);

        CGU.addstudent(s1);
        CGU.addstudent(s2);
        CGU.addstudent(s3);
        CGU.addstudent(s4);
        CGU.addstudent(s5);
        CGU.addstudent(s6);
        CGU.addstudent(s7);
        CGU.addstudent(s8);
        CGU.addstudent(s9);
        CGU.addstudent(s10);
        CGU.addstudent(s11);

        CGU.displaystudents();
        CGU.removestudent(15);
        CGU.displaystudents();
        CGU.searchstudent("ROHAN DAS");

    }

}
