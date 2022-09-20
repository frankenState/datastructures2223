/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M1L2;

/**
 *
 * @author frank lou
 */
public class ArrayDemonstration {
    public static void main(String[] args) {
        int[] intarray = new int[6];
        
        for (int i = 0; i < intarray.length; i++) 
            intarray[i] = (int)(Math.random() * 100);
        
        display(intarray);
        
        int[][] int2darray = new int[3][4];
        
        for (int[] int2darray1 : int2darray) 
            for (int j = 0; j < int2darray1.length; j++) 
                int2darray1[j] = (int)(Math.random() * 100);
         
//        int a = 10;
//        System.out.printf("%10d", a);
        
        display(int2darray);
        System.out.println("int2darray[0][1]=" + int2darray[0][1]);
        System.out.println("int2darray[2][3]=" + int2darray[2][3]);
    }
    
    public static void display(int[][] a){
        System.out.println("2D Array: ");
        for (int[] i : a) {
            for (int j : i) {
                System.out.printf("%-5d", j );
            }
            System.out.println("");
        }
            
    }
    
    public static void display(int[] a){
        System.out.print("Array: ");
        for (int i : a) System.out.print(i + " ");
        
        System.out.println("");
    }
}
