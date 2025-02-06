class OrderDetails{
    long order_id;
    String order_name;
    int order_quantity;
    int order_price;
    int total_price;
    
    OrderDetails(long a,String b,int c,int d){
        order_id=a;
        order_name=b;
        order_quantity=c;
        order_price=d;
    }
    
    void TotalPrice(){
        total_price= order_quantity*order_price;
    }
    void ShowDetails(OrderDetails object_name){
        System.out.println("=========== Hurrah ! You Got a Discount ==========");
        System.out.println("Order Id : "+object_name.order_id);
        System.out.println("Order Name : "+object_name.order_name);
        System.out.println("Order Quantity : "+object_name.order_quantity);
        System.out.println("Order Price Per Quanity : "+object_name.order_price);
        System.out.println("Total Price : "+(object_name.total_price));
        System.out.println("Total Price(After Discount 5%) : "+(object_name.total_price)*0.95);
        
    }
}

public class Order {
    public static void main(String[] args) {
        OrderDetails user1= new OrderDetails(12345, "Coffee Pouch Bru", 2, 3);
        user1.TotalPrice();

        OrderDetails user2= new OrderDetails(12348, "Tea Pouch Taj Mahal", 2, 2);
        user2.TotalPrice();
        if(user1.order_price > user2.order_price){
            user1.ShowDetails(user1);
        }
    }
    
}
