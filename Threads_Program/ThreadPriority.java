package Threads_Program;
class Numerical extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Value of I is : "+ i +" " +Thread.currentThread());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Alphabet extends Thread{
    public void run(){
        try {
            for (char i = 'A'; i <='E'; i++) {
                System.out.println("Value of I is : "+ i + " "+Thread.currentThread());
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Numerical user1 = new Numerical();
        Thread t1 = new Thread(user1);
        Alphabet user2 = new Alphabet();
        Thread t2= new Thread(user2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread t1 Priority is : "+ t1.getPriority());
        System.out.println("Thread t2 Priority is : "+ t2.getPriority());
        t1.start();
        // t1.suspend();
        t2.start();
        // t1.resume();


        
    }
    
}
