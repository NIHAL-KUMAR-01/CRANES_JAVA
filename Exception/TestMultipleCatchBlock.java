package Exception;

public class TestMultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]=30/0;
        }
        
        catch(ArithmeticException e){System.out.println("Task 1 is completed");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("Task 2 is completed");}
        catch(Exception e){System.out.println("common task completed ");}
        System.out.println("Rest of the code");
    }
    
}
