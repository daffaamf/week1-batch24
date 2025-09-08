package com.sqabatch24.javadasar;

public class App {

    public static void main(String[] args) {

        Kendaraan motor = new Kendaraan();
        motor.setAll("B 12345 ABC", "Hando", 8_000_000);

        String merek = motor.getMerek();
        String nopol = motor.getNopol();
        int harga = motor.getHarga();

        System.out.println("Merek : " + merek);
        System.out.println("Nopol : " + nopol);
        System.out.println("Harga : " + harga);

        User user = new User();

        user.cetak();

    }
}
