/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidtermExam;

import M2L1.*;
import M2L3TOL4.*;
import M3.*;
import java.util.Arrays;
/**
 *
 * @author frank lou
 */
public class Vehicle {
    private int passengers;
    public int getP(){ return this.passengers; }
    public void setP(int n){ this.passengers = n; }
    
    public Vehicle(int passengers){
        this.passengers = passengers;
    }
    
    public static void main(String[] args) {
        /*
        Module 1 Part 1
        1. int
        2. this.passengers;
        3. this.passengers = n;
        4. Vehicle
        5. extends
        6. super(passengers);
        */
        // Module 1 Part 2
        // #7 Answer
        Vehicle num7 = new Vehicle(5);
        // #8 Answer
        Motorcycle num8 = new Motorcycle(2, "underbone");
        // #9 Answer
        Vehicle[] num9 = new Vehicle[5];
        // #10 Answer
        Motorcycle[] num10 = new Motorcycle[8];
        // #11 Create 2D aray 5 rows and 8 cols
        Vehicle[][] num11 = new Vehicle[5][8];
        // #12 2D motorcycle 6 rows 10 cols
        Motorcycle[][] num12 = new Motorcycle[6][10];
        
        // Module 2 Part 1
        // #6 Answer
        Node<Integer> n1 = new Node<>(20);
        // #7 Answer
        Node<Character> n2 = new Node<>('A');
        // #8 Answer
        Node<String> n3 = new Node<>("Ubay");
        // #9 Answer
        Node<Double> n4 = new Node<>(5.4);
        // #10 Answer
        
        Node<Integer> n5 = new Node<>(10);
        Node<Integer> n6 = new Node<>(11);
        Node<Integer> n7 = new Node<>(12);
        n1.next = n5;
        n5.next = n6;
        n6.next = n7;
        
        // #10 answer
        Node<Integer> temp = n1;
        do {
            if (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            } else break;
        } while (true);
        
        // Module 2 Part 2
        System.out.println("\nsumNums(5) => " + sumInts(5));
        
        // Module 2 Part 3
        StackLinkedList<Integer> stack = new StackLinkedList<>();
        stack.push(3);
        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        System.out.println("\n------------ STACK ----------------");
        System.out.println("Initial stack => " + stack);
        stack.push(1);
        System.out.println("stack.push(1) => " + stack);
        stack.push( stack.pop() );
        System.out.println("stack.push(stack.pop()) => " + stack);
        stack.push( 75 );
        System.out.println("stack.push( 75 ) => " + stack);
        stack.pop();
        System.out.println("stack.pop() => " + stack);
        stack.pop();
        System.out.println("stack.pop() => " + stack);
        
        
        System.out.println("\n------------ QUEUE ----------------");
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();
        queue.enQueue(3);
        queue.enQueue(10);
        queue.enQueue(5);
        queue.enQueue(7);
        queue.enQueue(2);
        System.out.println("Initial queue => " + queue);
        queue.enQueue(1);
        System.out.println("queue.enQueue(1) => " + queue);
        queue.enQueue( queue.deQueue() );
        System.out.println("queue.enQueue(queue.deQueue()) => " + queue);
        queue.deQueue();
        System.out.println("queue.deQueue() => " + queue);
        queue.enQueue( queue.deQueue() );
        System.out.println("queue.enQueue(queue.deQueue()) => " + queue);
        queue.enQueue( queue.deQueue() * 5 );
        System.out.println("queue.enQueue(queue.deQueue() * 5) => " + queue);
        
        
        System.out.println("\n------------ Module 3 Searching ----------------");
        int[] num6 = {71, 34, 11, 10, 38, 41, 20, 64, 98, 87, 48, 87, 27, 93, 41, 59, 94, 97, 42, 54};
        System.out.print("M3#6=> ");
        SearchingAlgorithms.linearSearch(num6, 94);
        System.out.println("");
        
        int[] num7m3 = {10, 11, 20, 27, 34, 38, 41, 41, 42, 48, 54, 59, 64, 71, 87, 87, 93, 94, 97, 98};
        System.out.print("M3#7=> ");
        SearchingAlgorithms.binarySearch(num7m3, 97);
        System.out.println("");
        
        System.out.println("\n------------ Module 3 Quicksort ----------------");
        int m3num8[] = {30, 33, 83, 47, 32, 3, 93, 43, 64, 79, 84, 27};
        SortingAlgorithms.quickSort(m3num8);
        System.out.println("Sorted=> " + Arrays.toString(m3num8));
    }
    
    public static int sumNums(int n){
        if (n > 0){
            return n + sumNums(n - 1);
        } else return n;
    }
    
    public static int sumInts(int n){
        if (n <= 1) return 1;
        
        return n + sumInts(n  - 1);
    }
}

