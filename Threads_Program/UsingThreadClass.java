package Threads_Program;
class Demothread extends Thread{
    Demothread(){
        start();
    }
    public void run(){
        System.out.println("From Child Thread "+Thread.currentThread());
    }

}
public class UsingThreadClass {
    public static void main(String[] args) {
        Demothread user = new Demothread();
        Thread t = new Thread();
        t.setName("Main Class Main Class");
        System.out.println("From Main Class Thread "+ t);
        // user.start();
        
    }
    
}
