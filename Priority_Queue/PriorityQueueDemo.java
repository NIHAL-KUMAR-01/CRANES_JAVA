package Priority_Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue <Integer> minnodetree= new PriorityQueue<>();// min heap
        PriorityQueue <Integer> maxnodetree= new PriorityQueue<>(Collections.reverseOrder());// max heap
        minnodetree.offer(200);
        minnodetree.offer(50);
        minnodetree.offer(1000);
        minnodetree.offer(70);
        minnodetree.offer(80);
        // minnodetree.offer(400);
        // minnodetree.poll();
        System.out.print("Min Node Tree data  "+minnodetree);
        maxnodetree.offer(200);
        maxnodetree.offer(50);
        maxnodetree.offer(1000);
        maxnodetree.offer(70);
        maxnodetree.offer(80);
        // maxnodetree.offer(400);
        // maxnodetree.poll();
        System.out.print("\nMax Node Tree Data : "+ maxnodetree);


    }
    
}
