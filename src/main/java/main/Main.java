package main;

import entity.*;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 100, 1);
        Product milkQuantity = new Product("Milk", 100, 6);
        Product bread = new Product("Bread", 100, 1);
        Product breadSix = new Product("Bread", 100, 6);
        Product cheese = new Product("Cheese", 100, 1);
        Product pepsi = new Product("Pepsi", 100, 10);
        Product tacoSauce = new Product("Taco Sauce", 100, 50);

        Discount discount = new FridayDiscount(new MilkDiscount(new QuantityDiscount(null)));

        discountInfo(milk, discount);
        discountInfo(milkQuantity, discount);
        discountInfo(bread, discount);
        discountInfo(breadSix, discount);
        discountInfo(tacoSauce, discount);

    }

    private static void discountInfo(Product product, Discount discount) {
        double price = product.getProductPrice() * (product.getQuantity());
        double discountAmount = discount.apply(product);
        double newPrice = price - discountAmount;

        System.out.println("Product: " + product.getProductName());
        System.out.println("Price " + price + "kr" + " (" + product.getProductPrice() + " * " + product.getQuantity() + ")");
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Discount amount: " + discountAmount + "kr");
        System.out.println("New price " + newPrice + "kr");
        System.out.println("Description: " + discount.getDescription(product));
        System.out.println(" ");
    }
}
