package com.sqabatch24.javadasar;

public class Payment {
  private int grandTotal;
  private Cart[] carts;

  public Payment(Cart[] carts) {
    this.carts = carts;
    grandTotal = 0;

    calculate();
  }

  private void calculate() {
    for (Cart cart : carts) {
      grandTotal += cart.getSubtotal();
    }
  }

  public int getGrandTotal() {
    return grandTotal;
  }

  public void summary() {
    for (Cart cart : carts) {
      System.out.println(cart.getProduct().getName());
      System.out.println("Harga: " + cart.getProduct().getPrice());
      System.out.println("Quantity: " + cart.getQuantity());
      System.out.println("Subtotal: " + cart.getSubtotal());
    }

    // pertotal - diskon 30/50/70

    // System.out.println("Diskon: " + diskonDisini);

    // System.out.println("Harga diskon: " + grandTotal * (diskon/100));
    System.out.println("Harga before discount: " + grandTotal);
    System.out.println("Diskon: " + "sample 50%");
    System.out.println("Harga diskon: " + "masukinb harga diskon");
    System.out.println("Harga after discount: " + "masukin after diskon");
  }

  // method buat dapetin harga diskon (diskon yang udeh berbentuk harga)
  // hargaDiskon = grandTotal * (diskon / 100)

  // method buat dapeting total harga yang udeh di potong harga diskon
  // grandTotal - hargaDiskon

}
