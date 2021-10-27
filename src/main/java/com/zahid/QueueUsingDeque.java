package com.zahid;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    public static void main(String[] args) {
        // queue using ArrayDeque
        Deque<Integer> q = new ArrayDeque<>();
        
        q.offer(4);
        q.offer(9);
        q.offer(2);
        q.offer(3);
        q.offer(5);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        q.offer(7);
        q.offer(8);
        q.offer(1);
        q.offer(6);
        q.offer(0);
        System.out.println(q);
        System.out.println();

        // queue using Linked List
        Deque<String> nameQueue = new LinkedList<>();
        nameQueue.push("Alex");
        nameQueue.push("Lee");
        nameQueue.push("Cooper");
        nameQueue.push("John");
        nameQueue.push("Jane");
        nameQueue.push("David");

        System.out.println(nameQueue);
        System.out.println(nameQueue.peek());
        System.out.println(nameQueue.pop());
        System.out.println(nameQueue.peek());
        nameQueue.offer("Smith");
        nameQueue.offer("Shaun");
        System.out.println(nameQueue);
        nameQueue.push("Helen");
        System.out.println(nameQueue);
        
        // printing using stream api forEach()
        nameQueue.stream().forEach(name -> System.out.println(name));
    }
}
