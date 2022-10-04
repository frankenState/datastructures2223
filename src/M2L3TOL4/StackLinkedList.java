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
 * E = String, Integer, Double, ...
 */
public class StackLinkedList<E> {
    
   private LinkedList<E> stack;
    
   public StackLinkedList(){
       this.stack = new LinkedList<>();
   }
   // [d][c][b][a]
   public void push(E e){
       this.stack.addLast(e);
   }
   
   // 
   public E pop(){
       return this.stack.removeLast();
   }
   
   public boolean isEmpty(){
       return this.stack.getSize() == 0;
   }
   
   public String toString(){
       return this.stack.toString();
   }
    

    public static void main(String[] args) {
//        StackLinkedList<String> sll1 = new StackLinkedList<>();
//        
//        sll1.push("Hello");
//        sll1.push("world");
//        sll1.push("test");
//        System.out.println("Stack=> " + sll1);
//        
//        sll1.pop();
//        System.out.println("Stack=> " + sll1);
//        
//        String s1 = sll1.pop();
//        System.out.println("Stack=> " + sll1);
//        System.out.println("pop() in line 50 value=> " + s1);
          StackLinkedList<Integer> stack = new StackLinkedList<>();
          stack.push(3);
          stack.push(10);
          stack.push(7);
          stack.push(2);
          System.out.println("Stack=> " + stack);
          stack.push(1);
          System.out.println("1. " + stack);
          stack.push( stack.pop() );
          System.out.println("2. " + stack);
          stack.push(75);
          System.out.println("3. " + stack);
          stack.pop();
          System.out.println("4. " + stack);
          stack.pop();
          System.out.println("5. " + stack);
          
    }
}
