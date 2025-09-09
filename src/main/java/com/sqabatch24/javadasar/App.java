package com.sqabatch24.javadasar;

public class App {

    public static void main(String[] args) {
        Product produk01 = new Product();
        produk01.setId("P001");
        produk01.setName("Produk 1");
        produk01.setPrice(25000);

        Product produk02 = new Product();
        produk02.setId("P002");
        produk02.setName("Produk 2");
        produk02.setPrice(10500);

        Product produk03 = new Product();
        produk03.setId("P003");
        produk03.setName("Produk 3");
        produk03.setPrice(94500);

        Cart[] carts = {
                new Cart(produk01, (byte) 2),
                new Cart(produk02, (byte) 1),
                new Cart(produk03, (byte) 5)
        };

        int grandTotal = 0;

        for (Cart cart : carts) {
            System.out.println(cart.getProduct().getName());
            System.out.println("Harga: " + cart.getProduct().getPrice());
            System.out.println("Quantity: " + cart.getQuantity());
            System.out.println("Subtotal: " + cart.getSubtotal());
            grandTotal += cart.getSubtotal();
        }

        System.out.println("Total yang harus di bayar: " + grandTotal);

        // quantity => keranjang belanja => object Cart
        // stock => punya produk
    }
}

