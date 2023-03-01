/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M5L1;

/**
 *
 * @author frank lou
 */
public class TreeTraversals {
    
    public static void main(String[] args) {
        
        Node<Integer> e10 = new Node<>(10);
        Node<Integer> e7 = new Node<>(7);
        Node<Integer> e11 = new Node<>(11);
        Node<Integer> e6 = new Node<>(6);
        Node<Integer> e8 = new Node<>(8);
        Node<Integer> e20 = new Node<>(20);
        Node<Integer> e1 = new Node<>(1);
        Node<Integer> e9 = new Node<>(9);
        Node<Integer> e14 = new Node<>(14);
        Node<Integer> e22 = new Node<>(22);
        
        e1.left = e7;
        e1.left.left = e6;
        e1.left.right = e8;
        e1.left.left.left = e1;
        e1.left.right.right = e9;
        e1.right = e11;
        e1.right.right = e20;
        e1.right.right.left = e14;
        e1.right.right.right = e22;
 
        
        
        
        
        
        
        // Pre order NLR
       // System.out.println(e1.right.right.right.data);
      //  preOrder(e1);
        // In Order LNR
        preOrder(e1);
        // Post order LRN
    }
    

    public static void preOrder(Node<Integer> tree){
      
        // node
        if (tree.data != null)
            System.out.print(tree.data + " ");
            // access the left
        if (tree.left != null)
            preOrder(tree.left);
        
            // access the rightf
        if (tree.right != null)
            preOrder(tree.right);
        
    }
    
    
    
    
    
    
}
