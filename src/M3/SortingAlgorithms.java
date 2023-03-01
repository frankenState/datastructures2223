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
public class SortingAlgorithms {
    
    public static void main(String[] args) {
        int[] array = {-1, 99, 500, 93, 36, 112, 213, 123, 52, 98, 10};
        
        // quickSort(array);
         mergeSort(array);
        // insertionSort(array);
        // selectionSort(array);
        System.out.println("Selection Sort=> " + Arrays.toString(array));
    }
    
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int leastIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[leastIndex] > array[j])
                    leastIndex = j;
            }
            
            int temp = array[leastIndex];
            array[leastIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void insertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int current = i;
            while (current > 0 && array[current - 1] > array[current]){
                int temp = array[current - 1];
                array[current - 1] = array[current];
                array[current] = temp;
                current--;
            }
        }
    }
    
    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }
    
    public static void quickSort(int[] array, int first, int last){
        if (last > first){
            int pivotIndex = partition(array, first, last);
            quickSort(array, first, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, last);
        }
    }
    
    public static int partition(int[] array, int first, int last){
        int pivot = array[first];
        int low = first + 1;
        int high = last;
        
        while (high > low){
            while (low <= high && array[low] <= pivot)
                low++;
            
            while (high >= low && array[high] > pivot)
                high--;
            
            if (high > low){
                int temp = array[high];
                array[high] = array[low];
                array[low] = temp;
            }
        }
        
        while (high > first && array[high] >= pivot)
            high--;
        
        if (pivot > array[high]){
            array[first] = array[high];
            array[high] = pivot;
            
            return high;
        } else 
            return first;
    }
    
    
    public static void mergeSort(int[] array){
        if (array.length > 1){
            int[] first = new int[array.length / 2];
            System.arraycopy(array, 0, first, 0, array.length / 2);
            mergeSort(first);
            
            int secondLength = array.length - (array.length / 2);
            int[] second = new int[secondLength];
            System.arraycopy(array, array.length / 2, second, 0, secondLength);
            mergeSort(second);
            merge(first, second, array);
        }
    }
    
    public static void merge(int[] first, int[] second, int[] temp){
        int c1 = 0, c2 = 0, c3 = 0;
        
        while (c1 < first.length && c2 < second.length){
            if (first[c1] < second[c2])
                temp[c3++] = first[c1++];
            else
                temp[c3++] = second[c2++];
        }
        
        while (c1 < first.length)
            temp[c3++] = first[c1++];
        
        while (c2 < second.length)
            temp[c3++] = second[c2++];
        
    }
}
