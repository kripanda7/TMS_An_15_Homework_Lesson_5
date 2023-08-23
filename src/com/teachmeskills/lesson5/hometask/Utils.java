package com.teachmeskills.lesson5.hometask;

import java.util.Arrays;

public class Utils {
    public static void printMatrix(int[][][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void printMatrix(int[][] array) {
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static void printMatrix(String[][] array) {
        for (String[] a : array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
