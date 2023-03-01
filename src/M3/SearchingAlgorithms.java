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

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        return binarySearch(array, 0, array.length - 1, key);
    }

    public static int binarySearch(int[] array, int low, int up, int key) {
        if (up >= low) {
            int mid = (low + up) / 2; //low + (up - low) / 2; // mid = (low + high) / 2
            if (array[mid] > key) {
                return binarySearch(array, low, mid - 1, key);
            } else if (array[mid] < key) {
                return binarySearch(array, mid + 1, up, key);
            } else if (array[mid] == key) {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {71, 34, 11, 10, 38, 41, 20, 64};

        System.out.println(Arrays.toString(array));
        int index = linearSearch(array, 38);
        System.out.println("Index=> " + index);
        index = linearSearch(array, 68);
        System.out.println("Index=> " + index);

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        index = binarySearch(array, 10);
        System.out.println("Index=> " + index);
        index = binarySearch(array, 13);
        System.out.println("Index=> " + index);
        
        
        

    }

}
