package main;

import entity.*;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 500, 40);
        Product bread = new Product("Bread", 100, 50);
        Product cheese = new Product("Cheese", 100, 50);
        Product pepsi = new Product("Pepsi", 100, 50);
        Product tacoSauce = new Product("Taco Sauce", 20, 500);

        Discount discount = new FridayDiscount(new MilkDiscount(new QuantityDiscount(null)));

        System.out.println("Discount for milk: " + discount.apply(milk));
        System.out.println(discount.getDescription(milk));

        System.out.println("Discount for bread: " + discount.apply(bread));
        System.out.println(discount.getDescription(bread));

    }
}
