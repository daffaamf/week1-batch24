package com.sqabatch24.javadasar;

public class App {

    public static void main(String[] args) {
        Product produk01 = new Product();
        produk01.setId("P001");
        produk01.setName("Produk 1");
        produk01.setPrice(25_000); 
        
        Product produk02 = new Product();
        produk02.setId("P002");
        produk02.setName("Produk 2");
        produk02.setPrice(10_500);

        Product produk03 = new Product();
        produk03.setId("P003");
        produk03.setName("Produk 3");
        produk03.setPrice(94_500);

        Product produk04 = new Product();
        produk04.setId("P004");
        produk04.setName("Produk 4");
        produk04.setPrice(15_000);

        Product produk05 = new Product();
        produk05.setId("P005");
        produk05.setName("Produk 5");
        produk05.setPrice(75_000);

        Cart[] carts = {
                new Cart(produk01, (byte) 2),
                new Cart(produk02, (byte) 1),
                new Cart(produk03, (byte) 5),
                new Cart(produk04, (byte) 2),
                new Cart(produk05, (byte) 3)
        };

        Discount discount = new Discount();
        discount.setDiskon(30);

        Payment payment = new Payment(carts);
        payment.setDiscount(discount);
        payment.summary();
    }
}

