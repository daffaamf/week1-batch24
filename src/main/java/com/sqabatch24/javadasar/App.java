package com.sqabatch24.javadasar;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        ArrayList<Integer> tampungan = new ArrayList<>();
        int total = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Harga: ");
            int harga = sn.nextInt();

        if (harga == 99){
            break;
        }

        tampungan.add(harga);
        total += harga;
        }

        System.out.println("Daftar harga: " + tampungan);
        System.out.println("Total Harga: Rp " + total);
    }
}
