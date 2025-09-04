package com.sqabatch24.javadasar;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[][] myArray = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println(myArray[1][2]);
        System.out.println(myArray[3][2]);

        for (int[] baris : myArray) {
            for (int value : baris) {
                System.out.println(value);
            }
        }

        for (int baris = 0; baris < myArray.length; baris++) {
            for (int kolom = 0; kolom < myArray[baris].length; kolom++) {
                int cell = myArray[baris][kolom];
                System.out.println("Baris ke " + baris + " Kolom ke " + kolom + " Nilainya adalah = " + cell);
            }
        }
    }
}
