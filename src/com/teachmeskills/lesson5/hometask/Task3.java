package com.teachmeskills.lesson5.hometask;

import static com.teachmeskills.lesson5.hometask.Utils.printMatrix;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Array:");
        printMatrix(array);
        int sum = 0;
        for (int[] firstLayer : array) {
            for (int secondLayer : firstLayer) {
                sum += secondLayer;
            }
        }
        System.out.println("The sum of all arrays values: " + sum);
    }
}
