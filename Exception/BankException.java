package Exception;
class Bank{
    int balance=1000;
    public void withdrawal(int amount){
        if (amount > balance) {
            throw new ArithmeticException ("Amount is greater than balance") ;
        }
        else{
            System.out.println("Debit Successful !! Balance "+ (balance-amount));
        }
    }
}
public class BankException {
    public static void main(String[] args) {
        Bank user1 = new Bank();
        user1.withdrawal(1200);
        
    }
    
}
