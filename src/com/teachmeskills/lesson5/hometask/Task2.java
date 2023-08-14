package com.teachmeskills.lesson5.hometask;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][][] array1 = new int[3][3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array1[i][j].length; k++) {
                    array1[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        System.out.println("Array1: \n" + Arrays.deepToString(array1));
        int[][][] array2 = new int[3][3][3];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                for (int k = 0; k < array2[i][j].length; k++) {
                    array2[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        System.out.println("Array2: \n" + Arrays.deepToString(array2));
        int[][][] arrayResult = new int[3][3][3];
        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = 0; j < arrayResult[i].length; j++) {
                for (int k = 0; k < arrayResult[i][j].length; k++) {
                    arrayResult[i][j][k] = array1[i][j][k] * array2[i][j][k];
                }
            }
        }
        System.out.println(Arrays.deepToString(arrayResult));

    }
}
