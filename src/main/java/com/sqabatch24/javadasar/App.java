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

        for (int i = 0; i < nilai.length; i++) {
            System.out.println(("Nilai ke" + (i + 1) + "adalah = " + nilai[i]));
        }

        String[] daftarBelanja = {
            "Pepsovent",
            "Lafebuoy",
            "Lada bubuk",
            "Bawang putih",
            "Reenzo",
        };

        for (String barang : daftarBelanja){
            System.out.println(barang);
        }
    }
}
