package com.srinivas;

/**
 * Gallon to liters conversion
 * 1 Gallon = 3.7854 liters
 * Task: Output x gallons to liters
 */
public class Main {

    public static void main(String[] args) {
        double gallons;
        double gallonToLiter = 3.7854;

        // Output 5 liters in gallons
        gallons = 5;

        double fiveGallonsToLiters = gallons * gallonToLiter;

        System.out.println("5 gallons in liters " + fiveGallonsToLiters);
    }
}
