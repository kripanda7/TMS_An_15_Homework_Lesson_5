package com.teachmeskills.lesson5.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter value of the first dimension:");
        int first = scn.nextInt();
        System.out.println("Please, enter value of the second dimension:");
        int second = scn.nextInt();
        int[][] array = new int[first][second];
        int[] diagonal = new int[first < second ? first : second];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
            if (i <= array[i].length - 1) {
                diagonal[i] = array[i][i];
            }
        }
        System.out.println("Diagonal: " + Arrays.toString(diagonal));
    }
}
