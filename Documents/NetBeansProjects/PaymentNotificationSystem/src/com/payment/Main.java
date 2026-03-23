/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payment;

import java.util.Scanner;

/**
 *
 * @author Acer
 */

/**
 * Main class to run the application
 * Demonstrates Singleton and Adapter patterns
 */
public class Main {
    public static void main(String[] args) {

         // Scanner for user input (auto-closed using try-with-resources)
        try (Scanner sc = new Scanner(System.in)) {
            
            // Get Singleton instance of PaymentSystem
            PaymentSystem system = PaymentSystem.getInstance();
            
            // Create adapters for different payment systems
            PaymentProcessor paypal = new PayPalAdapter(new PayPal());
            PaymentProcessor bank = new BankAdapter(new BankTransfer());
            
            int choice;
            
            // Loop to display menu until user chooses Exit
            do {
                System.out.println("\n====== Payment Notification System ======");
                System.out.println("1. Process PayPal Payment");
                System.out.println("2. Process Bank Transfer Payment");
                System.out.println("3. View Payment History");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                
                // Handle user choice using switch-case
                switch(choice) {
                    case 1 -> {
                        // Process PayPal payment
                        System.out.print("Enter amount: ");
                        double paypalAmount = sc.nextDouble();
                        system.makePayment(paypal, paypalAmount);
                    }
                    case 2 -> {
                        // Process Bank Transfer payment
                        System.out.print("Enter amount: ");
                        double bankAmount = sc.nextDouble();
                        system.makePayment(bank, bankAmount);
                    }
                    case 3 -> 
                        // Display all processed payments
                        system.showPaymentHistory();
                    case 4 -> 
                        // Exit the system
                        System.out.println("Exiting system. Goodbye!");
                    default -> 
                        // Handle invalid input
                        System.out.println("Invalid choice! Try again.");
                }
                
            } while(choice != 4);  // Continue until user exits
        }
    }
}
