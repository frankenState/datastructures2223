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
public class HeapSort {
    
    public void sort(int[] array){
        int length = array.length;
        
        for (int i = length / 2 - 1; i >= 0; i--){
            heapify(array, length, i);
        }
        
        for (int i = length - 1; i > 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            
            heapify(array, i, 0);
        }
    }
    
    public void heapify(int[] array, int length, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < length && array[left] > array[largest])
            largest = left;
        
        if (right < length && array[right] > array[largest])
            largest = right;
        
        if (largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            
            heapify(array, length, largest);
        }
    }
    
    public static void main(String[] args) {
        HeapSort heap = new HeapSort();
        
        
        int[] array = {1,-9, 5, 98, 10, 55, 78, 100};
        heap.sort(array);
        System.out.println("HeapSort=> " + Arrays.toString(array));
    }
}
