package Threads_Program;

class Callme {
    String mess;

    synchronized void printmessage(String message) {
        try {
            mess = message;
            System.out.println("[ " + mess);
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println(" ] ");

        }

    }

}

class Caller implements Runnable {
    Callme user = new Callme();
    String mess2;

    synchronized void printsyc(String sync) {
        mess2 = sync;
        System.out.println("[ " + mess2 + "]");
    }

    public void run() {
        try {
            user.printmessage("Hello");
            Thread.sleep(1000);
            printsyc("Sync");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class CallerCallme {
    public static void main(String[] args) {
        Caller user = new Caller();
        Thread t1 = new Thread(user);
        t1.start();

    }

}
