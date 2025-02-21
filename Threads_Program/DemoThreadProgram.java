package Threads_Program;
class DemoRunnable implements Runnable{
    public void run(){
        try {
            for (char i = 'A'; i < 'F'; i++) {
                System.out.println("From Child Thread "+ Thread.currentThread()+" i = "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

}

public class DemoThreadProgram {
    public static void main(String[] args) {
        DemoRunnable user  = new DemoRunnable();
        Thread t = new Thread(user);
        t.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("From Main Thread "+ Thread.currentThread()+" i = "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        
    }
    
}
