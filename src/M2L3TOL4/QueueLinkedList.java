/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M2L3TOL4;
import M2L1.*;
/**
 *
 * @author frank lou
 */
public class QueueLinkedList<E> {
    
    private LinkedList<E> queue;
    
    public QueueLinkedList(){
        this.queue = new LinkedList<>();
    }
    
    // [d][c][b][a]
    public void enQueue(E e){
        this.queue.addLast(e);
    }
    // 
    public E deQueue(){
        return this.queue.removeFirst();
    }
    
    // [d][c][b][a]
    public E peek(){
        return this.queue.get(0);
    }
    
    public boolean isEmpty(){
        return this.queue.getSize() == 0;
    }
    
    public String toString(){
        return this.queue.toString();
    }
    
    public static void main(String[] args) {
//        QueueLinkedList<String> cashier = new QueueLinkedList<>();
//        
//        cashier.enQueue("Jane");
//        cashier.enQueue("Mark");
//        cashier.enQueue("John");
//        System.out.println("Queue=> " + cashier);
//        
//        cashier.deQueue();
//        System.out.println("Queue=> " + cashier);
//        
//        cashier.deQueue();
//        System.out.println("Queue=> " + cashier);
//        
//        cashier.enQueue("Leni");
//        System.out.println("Queue=> " + cashier);
//        
//        System.out.println("Peek=> " + cashier.peek());
//        cashier.deQueue();
//        
//        System.out.println("Peek=> " + cashier.peek());
//        cashier.deQueue();
//        
//        System.out.println("Is Empty? " + cashier.isEmpty());
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();
        queue.enQueue(3);
        queue.enQueue(10);
        queue.enQueue(5);
        queue.enQueue(7);
        queue.enQueue(2);
        System.out.println(queue);
        queue.enQueue(1);
        System.out.println("1. " + queue);
        queue.enQueue( queue.deQueue() );
        System.out.println("2. " + queue);
        queue.deQueue();
        System.out.println("3. " + queue);
        queue.enQueue( queue.deQueue() );
        System.out.println("4. " + queue);
        queue.enQueue( queue.deQueue() * 5 );
        System.out.println("5. " + queue);
        
    }
}
