/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3;

import java.util.Arrays;

/**
 *
 * @author frank lou
 */
public class SearchingAlgorithms {
    
    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) 
            if (key == array[i]) return i;
        
        return -1;
    }
    
    public static int binarySearch(int[] array, int key){
        return binarySearch(array, 0, array.length - 1, key);
    }
    
    public static int binarySearch(int[] array, int low, int up, int key){
        if (up >= low){
            int mid = low + (up - low) / 2; // mid = (low + high) / 2
            
            if (array[mid] > key)
                return binarySearch(array, low, mid - 1, key);
            else if (array[mid] < key)
                return binarySearch(array, mid + 1, up, key);
            else if (array[mid] == key)
                return mid;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {1, -10, 12, 21, 99, 500, 66};
        
        System.out.println(Arrays.toString(array));
        System.out.println("Index of 99 is " + linearSearch(array, 99));
        
        
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Index of 99 is " + binarySearch(array, 99));
        System.out.println("Index of 75 is " + binarySearch(array, 75));
    }
    
}
