package com.zahid;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque 
{
    public static void main( String[] args )
    {
        Deque<Double> decimals = new ArrayDeque<>();
        decimals.offerLast(3.14159);
        decimals.offerLast(2.71828);
        decimals.offerLast(6.023e23);
        decimals.offerLast(6.26e-34);
        decimals.offerLast(5.7e24);
        decimals.offerLast(6e6);
        
        System.out.println(decimals);
        
        System.out.println(decimals.pollLast());
        System.out.println(decimals);
        System.out.println(decimals.peekLast());
        System.out.println(decimals.pollLast());
        System.out.println(decimals);
        
        // printing elsements using stream api forEach
        decimals.stream().forEach(e -> System.out.println(e));
        System.out.println();

        Deque<Integer> numbers = new LinkedList<>();
        numbers.offerLast(4);
        numbers.offerLast(9);
        numbers.offerLast(2);
        numbers.offerLast(3);
        numbers.offerLast(5);
        System.out.println(numbers);
        System.out.println(numbers.peekLast());
        System.out.println(numbers.pollLast());
        System.out.println(numbers.pollLast());
        numbers.offerLast(7);
        numbers.offerLast(8);
        numbers.offerLast(1);
        System.out.println(numbers);

        numbers.stream().forEach(num -> System.out.println(num));
    }
}
