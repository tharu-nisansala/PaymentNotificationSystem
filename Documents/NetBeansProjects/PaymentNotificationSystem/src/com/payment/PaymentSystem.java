/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */

/**
 * Singleton Class
 * Ensures only one instance of PaymentSystem exists
 */
public class PaymentSystem {
    
   private static PaymentSystem instance;  // Single instance
   
   private List<String> paymentHistory; // Store processed payments


   // Private constructor prevents direct object creation
    private PaymentSystem() {
        paymentHistory = new ArrayList<>();
        System.out.println("Payment System Initialized");
    }

    // Provides global access to the single instance
    public static synchronized PaymentSystem getInstance() {
        if (instance == null) {
            instance = new PaymentSystem();
        }
        return instance;
    }

     // Process a payment using adapter
    public void makePayment(PaymentProcessor processor, double amount) {
        processor.processPayment(amount);
    }

    // Add to payment history
    public void addPaymentHistory(String type, double amount) {
        paymentHistory.add(type + ": " + amount);
    }

    // Show all processed payments
    public void showPaymentHistory() {
        System.out.println("\n--- Payment History ---");
        if(paymentHistory.isEmpty()){
            System.out.println("No payments processed yet.");
            return;
        }
        for(String record : paymentHistory){
            System.out.println(record);
        }
        System.out.println("----------------------\n");
    }
}
