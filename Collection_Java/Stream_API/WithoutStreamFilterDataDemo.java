package Collection_Java.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class product{
    int pid;
    String pname;
    double price;
    public product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    @Override
    public String toString(){
        return "{ Pid "+ pid+" Pname  "+pname+" Price: "+price+" }";
    }
    
}

public class WithoutStreamFilterDataDemo {
    public static void main(String[] args) {
        ArrayList <product> productlist = new ArrayList<>();
        productlist.add(new product(101, "Cooler", 1500));
        productlist.add(new product(102, "AC", 1600));
        productlist.add(new product(103, "MI Mobile", 900));
        productlist.add(new product(104, "TV", 4500));
        productlist.add(new product(105, "Cooler Remote", 200));
        System.out.println("Showing Product List\n");
        productlist.forEach(System.out::println);

        ArrayList <product> sortedproduct = new ArrayList<>();
        for(product p : productlist){
            if (p.price>=1500) {
                sortedproduct.add(p);
                
            }
        }

        System.out.println("Showing Sorted Product without using stream API:");
        sortedproduct.forEach(System.out::println);



        System.out.println("With Stream API");
        List <product> Streamsortedproduct = new ArrayList<>();



        Streamsortedproduct=productlist.stream()
        .filter(p->p.price>1500)
        .collect(Collectors.toList());


        Streamsortedproduct.forEach(System.out::println);

        System.out.println("\nUsing Stream API to print first 5 even number ");
        Stream.iterate(1, element->element+1)
        .filter(element->element%2==0)
        .limit(5)
        .forEach(System.out::println);


        Double totalprice=productlist.stream()
        .map(p3->p3.price)
        .reduce(0.0,(sum,price)->(sum+price));

        System.out.println("Total Price of the product price in the Productlist : "+totalprice);

        Double tot=productlist.stream().map(p3->p3.price).reduce(0.0,Double::sum );

        System.out.println(tot);

    }
    
}
