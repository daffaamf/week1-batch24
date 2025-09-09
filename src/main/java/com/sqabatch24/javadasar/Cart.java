package com.sqabatch24.javadasar;

public class Cart {
  private Product product;
  private byte quantity;
  private int subtotal;

  public Cart(Product product, byte quantity) {
    setProduct(product);
    setQuantity(quantity);
    setSubtotal();
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public byte getQuantity() {
    return quantity;
  }

  public void setQuantity(byte quantity) {
    this.quantity = quantity;
  }

  public int getSubtotal() {
    return subtotal;
  }

  public void setSubtotal() {
    this.subtotal = quantity * product.getPrice();
  }

}
