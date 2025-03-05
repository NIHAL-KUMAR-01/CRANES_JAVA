package Collection_Java;
interface printmessage{
    public void display();
}

public class LambdaDemo {
    public static void main(String[] args) {
        printmessage p = new printmessage(){
            public void display(){
                System.out.println("Hello There !!");
            }
        };
        p.display();
        
        printmessage p2= ()->{
            System.out.println("USing Lambda Function");
        };

        p2.display();
        
    }
    
}
