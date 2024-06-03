package com.brocode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //queue - FIFO - first in first out
        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Harold");
        //queue.poll(); //removes the first item in the queue
        //queue.peek(); //returns the first item in the queue
        // queue.isEmpty(); //returns true if the queue is empty
        // queue.size(); //returns the size of the queue
        // queue.contains("Tom"); //returns true if the queue contains the item

        System.out.println(queue.peek());

    }
}
