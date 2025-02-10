class Institution{
    String name;
    String location;
    Institution(){};
    Institution(String a,String b){
        name=a;
        location=b;
    };
    void displayInstitutionInfo(){
        System.out.println("===Institution Details===");
        System.out.println("Institution Name : "+name);
        System.out.println("Institution Location : "+location );

    }
}
class University extends Institution{
    int ranking;
    int noofStudents;
    University(){};
    University(int a,int b){
        super("C.V. RAMAN GLOBAL UNIVERSITY","BHUBANESWAR , ODISHA ");
        ranking=a;
        noofStudents=b;
    }
    void displayInstitutionInfo(){
        System.out.println("===Institution Details===");
        System.out.println("Institution Name : "+name);
        System.out.println("Institution Location : "+location );
        System.out.println("College Ranking "+ranking);
        System.out.println("No of Students "+noofStudents);
    }
}
class Department extends University{
    String departmentname;
    String headofdepartment;
    Department(){}
    Department(String a,String b){
        super(101,6000);
        departmentname=a;
        headofdepartment=b;
        
    }
    void displayInstitutionInfo(){
        System.out.println("===Institution Details===");
        System.out.println("Institution Name : "+name);
        System.out.println("Institution Location : "+location );
        System.out.println("College Ranking : "+ranking);
        System.out.println("No of Students : "+noofStudents);
        System.out.println("Department name: "+departmentname);
        System.out.println("Head of the Department : "+headofdepartment);
    }
    
}
public class InstitutionDetails {
    public static void main(String[] args) {
        Department cse = new Department("Computer Sci & Engineeering","Prof. Monalisa Misra");
        cse.displayInstitutionInfo();
    }
    
}
