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
 * Converts BankTransfer class into PaymentProcessor interface
 */
public class BankAdapter implements PaymentProcessor{
    
    // Reference to the existing BankTransfer class (Adaptee)
    private final BankTransfer bank;

    // Constructor to initialize BankTransfer object
    public BankAdapter(BankTransfer bank) {
        this.bank = bank;
    }

    //Overridden method from PaymentProcessor interface
    @Override
    public void processPayment(double amount) {
        
        // Validate payment amount
        if(amount <= 0){
            System.out.println("Invalid amount! Payment failed.");
            return;
        }
        
        // Call BankTransfer's original method
        bank.transfer(amount);
        
        // Add payment record to history using Singleton PaymentSystem
        PaymentSystem.getInstance().addPaymentHistory("Bank Transfer", amount);
    }
}
