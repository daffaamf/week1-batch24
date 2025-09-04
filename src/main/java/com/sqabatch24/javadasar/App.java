package com.sqabatch24.javadasar;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Challenge

        // berikut adalah map untuk game
        // map yang sisa bagi 3 = 0 adalah
        // tempat enemy berada, hindari map itu
        // spawn -> nyatet letak koordinat musuh (x % 3 = 0).
        // catatan spawn di cetak

        int[][] gameMap = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        String musuh = ""; 

         for (int baris = 0; baris < gameMap.length; baris++) {
            for (int kolom = 0; kolom < gameMap[baris].length; kolom++) {
                int cell = gameMap[baris][kolom];
                if (cell % 3 == 0) {
                    musuh += "(" + baris + "," + kolom + ") ";
                } else {
                    System.out.println("Player jalan ke (" + baris + "," + kolom + ") nilai = " + cell);
                }
            }
        }
        System.out.println("\nKoordinat musuh yang harus dihindari:");
        System.out.println(musuh);
    }
}