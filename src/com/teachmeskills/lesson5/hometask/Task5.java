package com.teachmeskills.lesson5.hometask;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Array: " + Arrays.deepToString(array));
        for (int[] lines : array) {
            Arrays.sort(lines);
        }
        System.out.println("Sorted array: " + Arrays.deepToString(array));
    }
}
