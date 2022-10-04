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
            System.out.print(i + ", ");
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
            int mid = low + (up - low) / 2; // mid = (low + high) / 2
            System.out.print(mid + " ");
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
        int[] array = {71, 34, 11, 10, 38, 41, 20, 64, 98, 87, 48, 87, 27, 93, 41, 59, 94, 97, 42, 54};

        System.out.print("1. ");
        linearSearch(array, 94);
        System.out.println("");

        Arrays.sort(array);

        System.out.println("Sorted=> " + Arrays.toString(array));
        System.out.print("2. ");
        binarySearch(array, 97);
        System.out.println("");
        
        
        

    }

}
