package com.sqabatch24.javadasar;

public class App {

    public static void main(String[] args) {
        int[] nilai = {
                1, // 0
                2, // 1
                3, // 2
                4, // 3
                5, // 4
                6, // 5
                7, // 6
                8, // 7
                9, // 8
                10, // 9
                11, // 10
                12, // 11
        };

        int[] nilaiHasilCopy = new int [5];

        nilaiHasilCopy[0] = nilai[0];
        
        System.out.println(nilai[3]);
        System.out.println(nilai[11]);
        System.out.println(nilai);
        System.out.println(nilai[nilai.length - 1]);
        System.out.println(nilaiHasilCopy[4]);
    }
}
