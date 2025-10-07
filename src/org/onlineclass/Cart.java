package org.onlineclass;

class Cart {
    Product product;

    // Method to add product
    void addProduct(Product p) {
        this.product = p;
        System.out.println(p.name + " added to cart.");
    }

    // Method to show cart
    void viewCart() {
        if (product != null) {
            System.out.println("Cart contains: " + product.name + " - $" + product.price);
        } else {
            System.out.println("Cart is empty.");
        }
    }
}
