package Vector_Java_Demo;

import java.util.Vector;

class ThreadVector implements Runnable {
    Vector<Integer> list;

    ThreadVector() {
        list = new Vector<>();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            list.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
        }
    }
}

public class MultiThreadVector {
    public static void main(String[] args) {
        ThreadVector obj = new ThreadVector(); 

        Thread t1 = new Thread(obj, "Thread-1");
        Thread t2 = new Thread(obj, "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Vector: " + obj.list);
    }
}
