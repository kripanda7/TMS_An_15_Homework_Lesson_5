package com.teachmeskills.lesson5.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        int third = scn.nextInt();
        int[][][] array = new int[first][second][third];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Initial array: " + Arrays.deepToString(array));
        System.out.println("Please, enter the number: ");
        int number = scn.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = array[i][j][k] + number;
                }
            }
        }

        System.out.println("Modified array: " + Arrays.deepToString(array));
    }
}
