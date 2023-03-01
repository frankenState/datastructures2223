/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M5L1;

/**
 *
 * @author frank lou
 */
public class Node<E> {
    
    E data;
    Node<E> left, right;
    
    public Node(E data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
