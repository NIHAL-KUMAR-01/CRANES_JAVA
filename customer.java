import java.util.*;

class data{
    long cus_id;
    Strings cus_name;
    long mobile_no;
    Strings cus_city;
    void readcustomer(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Customer id: ");
        cus_id=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        cus_name=sc.nextLine();
        System.out.print("Enter Customer Mobile No: ");
        mobile_no=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Customer City: ");
        cus_city=sc.nextLine();

    }
    void showdata(){
        System.out.println("================================Customer Data Details================================");
        System.out.println("Customer id : "+cus_id);
        System.out.println("Customer Name : "+cus_name);
        System.out.println("Customer Mobile No : "+mobile_no);
        System.out.println("Customer City : "+cus_city);
        

    }
}
public class customer {
    public static void main(Strings args[]){
        data[] user = new data[5];
        for(int i=0;i<5;i++){
            user[i]= new data();
            user[i].readcustomer();

        }
        for(int i=0;i<5;i++){
            user[i].showdata();
        }

    }
}