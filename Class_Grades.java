class Grades{
    private int math,phy,bio;
    private int total;
    private float avg;
    Grades(int a,int b,int c){
        
        if((a<=100 && a>=0)&&(b<=100 && b>=0)&&(c<=100 && c>=0)){
            math=a;
            phy=b;
            bio=c;

        }else{
           System.out.println("Invalid Data Entered");
           System.exit(0);
        }
    }

    void findTotal(){
        total=math+phy+bio;
        System.out.println("Total Marks : "+ total);
    }

    void findAvg(){
        avg= total/3;
        System.out.println("Average Marks : "+avg);
    }
    
    void setGrade(){
        if(avg>=70){
            System.out.println("Grade ='A'");
        }else if((avg<70)&& (avg>=60)){
            System.out.println("Grade ='B' ");
        }else if((avg<60)&& (avg>=50)){
            System.out.println("Grade ='C' ");
        }else if((avg<50)||(math<35 || phy <35 || bio<35)){
            System.out.println("Grade ='Fail' ");
        }
    }  
}

public class Class_Grades {
    public static void main(String[] args) {
        Grades user1= new Grades(35, 90, 35);
        user1.findTotal();
        user1.findAvg();
        user1.setGrade();
        
    } 
}
