/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M2L1;

/**
 *
 * @author frank lou
 * Wrapper classes [String, Integer,...]
 * Generics [String,Integer,Double,...]
 */
public class Node<E> {
    E data;
    Node<E> next;
    
    public Node(E e){
        this.data = e;
    }
}
