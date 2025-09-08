package com.sqabatch24.javadasar;

public class Kendaraan {
  private String nopol;
  private String merek;
  private int harga;

  public void setAll(String nomorPolisi, String merekKendaraan, int hargaKendaraan) {
    // nopol = nomorPolisi;
    // merek = merekKendaraan;
    // harga = hargaKendaraan;

    setNopol(nomorPolisi);
    setMerek(merekKendaraan);
    setHarga(hargaKendaraan);
  }

  // setter method
  public void setNopol(String nomorPolisi) {
    nopol = nomorPolisi;
  }

  public void setMerek(String merekKendaraan) {
    merek = merekKendaraan;
  }

  public void setHarga(int hargaKendaraan) {
    harga = hargaKendaraan;
  }

  // getter method
  public String getNopol() {
    return nopol;
  }

  public String getMerek() {
    return merek;
  }

  public int getHarga() {
    return harga;
  }

}
