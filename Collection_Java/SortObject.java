package Collection_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Product{
    String pname;
    double pprice;
    public Product(String pname, double pprice) {
        this.pname = pname;
        this.pprice = pprice;
    }
    @Override
    public String toString(){
        return " Product Name: "+pname+" Price :"+ pprice;
    }
}

public class SortObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Product> itemlist= new ArrayList<>();
        // for (int i = 0; i < 2; i++) {
        //     System.out.println();
        //     System.out.print("Enter product name: ");
        //     String temp1 = sc.nextLine();
        //     System.out.print("Enter Price: ");
        //     double temp2 = sc.nextDouble();
        //     sc.nextLine();            
        //     Product p1= new Product(temp1, temp2);
        //     itemlist.add(p1);
        // }

        itemlist.add(new Product("HP", 75000));
        itemlist.add(new Product("Dell", 65000));


        System.out.println(itemlist);

        Collections.sort(itemlist,(p1,p2)->{
            return Double.compare(p1.pprice, p2.pprice);
        });
        System.out.println(itemlist);
    }
    
}
