package org.onlineclass;

import java.util.Scanner;

public class ShoppingCartSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name);

        // Create a product
        Product product = new Product("Book", 19.99);

        // Create cart
        Cart cart = new Cart();

        // Add product to cart
        System.out.println("Welcome, " + user.username + "!");
        System.out.println("Available product: " + product.name + " - $" + product.price);

        System.out.print("Do you want to add it to your cart? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            cart.addProduct(product);
        }

        // Show cart
        cart.viewCart();
        scanner.close();
    }
}