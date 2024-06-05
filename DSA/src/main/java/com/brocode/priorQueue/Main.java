package com.brocode.priorQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
//Collections.reverseOrder()
       queue.offer("Karen");
       queue.offer("Chad");
       queue.offer("Harold");
       queue.offer("Tom");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
