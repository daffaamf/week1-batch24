package com.sqabatch24.javadasar;

public class Payment {
  private int grandTotal;
  private Cart[] carts;
  private Discount discount;

  public Payment(Cart[] carts) {
    this.carts = carts;
    this.grandTotal = 0;
    calculate();
  }

  private void calculate() {
    for (Cart cart : carts) {
      grandTotal += cart.getSubtotal();
    }

  }
  public void setDiscount(Discount discount) {
      this.discount = discount;
  }

  public int getGrandTotal() {
    return grandTotal;
  }

  public void calculateDiscount(){
    int discountPrice = grandTotal * discount.getDiskon() / 100;
    System.out.println("Discount price: Rp." + discountPrice );
  }

  private void calculateDiscountPrice(){
    int discountPrice = grandTotal * discount.getDiskon() / 100;
    int afterDiscount = grandTotal - discountPrice;
    System.out.println("Grand total: Rp." + afterDiscount );
  }

  public void summary() {
    for (Cart cart : carts) {
      System.out.println(cart.getProduct().getName());
      System.out.println("Price: Rp." + cart.getProduct().getPrice() );
      System.out.println("Quantity: " + cart.getQuantity() + "  Pcs");
      System.out.println("Total: Rp." + cart.getSubtotal() + "\n");
    }

    // pertotal - diskon 30/50/70

    // System.out.println("Diskon: " + diskonDisini);

    // System.out.println("Harga diskon: " + grandTotal * (diskon/100));
    System.out.println("Subtotal: Rp." + grandTotal);
    System.out.println("Discount: Rp." + discount.getDiskon() + "%");

    calculateDiscount();
    calculateDiscountPrice();
  }

  // method buat dapetin harga diskon (diskon yang udeh berbentuk harga)
  // hargaDiskon = grandTotal * (diskon / 100)

  // method buat dapeting total harga yang udeh di potong harga diskon
  // grandTotal - hargaDiskon

}
