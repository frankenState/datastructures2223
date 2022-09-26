/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M2L1;

/**
 *
 * @author frank lou
 * String, Integer, Double, ...
 */
public class LinkedList<E> {
    
    private Node<E> head, tail;
    private int size = 0;
    public int getSize() { return this.size; }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = this.head;
        this.head =  newNode;
        this.size++;
        
        if (this.tail == null)
            this.tail = this.head;
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        
        if (this.tail == null)
            this.head = this.tail = newNode;
        else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
        this.size++;
    }
    
    public void add(int index, E e){
        if (index == 0) this.addFirst(e);
        else if (index >= this.size) this.addLast(e);
        else {
            Node<E> current = this.head;
            for (int i = 1; i < index; i++)
                current = current.next;
            
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            this.size++;
        }
    }
    
    public E removeFirst(){
        if (this.size == 0) return null;
        else {
            Node<E> temp = this.head;
            this.head = this.head.next;
            this.size--;
            if (head == null) this.tail = null;
            return temp.data;
        }
    }
    
    public E removeLast(){
        if (this.size == 0) return null;
        else if (this.size == 1){
            Node<E> temp = this.head;
            this.head = this.tail =null;
            this.size = 0;
            return temp.data;
        } else {
            Node<E> current = this.head;
            
            for (int i = 0; i < this.size - 2; i++)
                current = current.next;
            
            Node<E> temp = this.tail;
            this.tail = current;
            this.tail.next = null;
            this.size--;
            return temp.data;
        }
    }
    
    public E remove(int index){
        if (index < 0 || index >= this.size) return null;
        else if (index == 0) return this.removeFirst();
        else if (index == size - 1) return this.removeLast();
        else {
            Node<E> previous = this.head;
            
            for (int i = 1; i < index; i++)
                previous = previous.next;
            
            Node<E> current = previous.next;
            previous.next = current.next;
            this.size--;
            return current.data;
        }
    }
    
    public String toString(){
        String txt = "[";
        
        Node<E> temp = this.head;
        
        while (temp != null){
            txt += temp.data;
            
            if (temp.next != null)
                txt += ", ";
            
            temp = temp.next;
        }
        
        return txt + "]";
    }
    
    //
    public boolean contains(E e ){
        
        Node<E> temp = this.head;
        
        while (temp != null){
            if (temp.data == e) return true;
            
            temp = temp.next;
        }
        
        return false;
    }
    
    public E get(int index){
     
        Node<E> temp = this.head;
        
        for (int i = 0; i < this.size; i++) {
            if (index == i) return temp.data;
            
            temp = temp.next;
        }
        
        return null;
    }
    
    public int indexOf(E e){
        
        Node<E> temp = this.head;
        
        for (int i = 0; i < this.size; i++) {
            if (temp.data == e) return i;
            
            temp = temp.next;
        }
        
        return -1;
    }
    
    public int lastIndexOf(E e){
        
        int index = -1;
        
        Node<E> temp = this.head;
        
        for (int i = 0; i < this.size - 1; i++) {
            if (temp.data == e) 
                index = i;
            
            temp = temp.next;
        }
        
        return index;
    }
    
    public E set (int index, E e){
        
        if (index == 0) this.addFirst(e);
        else if (index == this.size - 1) this.addLast(e);
        else {
            Node<E> previous = this.head;
        
            for (int i = 1; i < index; i++) 
                previous = previous.next;
            
            Node<E> current = previous.next;
            previous.next = new Node<>(e);
            (previous.next).next = current.next;
            
        }
        
        
        return e;
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> intLL1 = new LinkedList<>();
        System.out.println("Values => " + intLL1);
        intLL1.addFirst(10);
        System.out.println("Values => " + intLL1);
        intLL1.addFirst(15);
        System.out.println("Values => " + intLL1);
        intLL1.addFirst(20);
        System.out.println("Values => " + intLL1);
        intLL1.addLast(25);
        System.out.println("Values => " + intLL1);
        System.out.println(intLL1.contains(11));
        System.out.println(intLL1.get(1));
        System.out.println("Indexof=> " + intLL1.indexOf(11));
        
//        
//        
//        
//        intLL1.addLast(30);
//        intLL1.addLast(35);
//        
//        System.out.println("intLL1: " + intLL1);
//        
//        intLL1.add(3, -10);
//        System.out.println("intLL1: " + intLL1);
//        
//        int value = intLL1.removeFirst();
//        System.out.println("intLL1: " + intLL1);
//        System.out.println("First Element: " + value);
//        
//        value = intLL1.removeLast();
//        System.out.println("intLL1: " + intLL1);
//        System.out.println("Last Element: " + value);
//        
//        value = intLL1.remove(2);
//        System.out.println("intLL1: " + intLL1);
//        System.out.println("Last Element: " + value);
//        
//        System.out.println("25? " + intLL1.contains(26));
//        System.out.println("Index 1 is => " + intLL1.get(2));
//        System.out.println("Index of 25 => " + intLL1.indexOf(25));
//        intLL1.addLast(10);
//        intLL1.addLast(99);
//        System.out.println(intLL1);
//        System.out.println("last Index of 10 => " + intLL1.lastIndexOf(10));
//        System.out.println("Index=> " + intLL1.set(1, 11));
//        System.out.println(intLL1);
//        System.out.println("Index=> " + intLL1.set(2, 12));
//        System.out.println(intLL1);
//
//        LinkedList<String> names = new LinkedList<>();
//        names.addFirst("Frank");
//        names.addLast("Johmoses");
//        

    }
    
}
