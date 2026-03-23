/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payment;

/**
 *
 * @author Acer
 */

/**
 * Adapter Class (Adapter Pattern)
 * Converts PayPal class into PaymentProcessor interface
 */
public class PayPalAdapter implements PaymentProcessor{
    
    // Reference to the existing PayPal class (Adaptee)
    private final PayPal paypal;
    
    // Constructor to initialize PayPal object
    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }
     
   //Overridden method from PaymentProcessor interface
    @Override
    public void processPayment(double amount){
        
       // Validate payment amount
       if(amount <= 0){
            System.out.println("Invalid amount! Payment failed.");
            return;
        }
       
        // Call PayPal's original method
        paypal.sendPayment(amount);
        
        // Add payment record to history using Singleton PaymentSystem
        PaymentSystem.getInstance().addPaymentHistory("PayPal", amount);
    }
    
    
}
