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
 * Existing class (Adaptee)
 * Represents PayPal payment system with its own method
 */
public class PayPal {
    public void sendPayment(double amount) {
        System.out.println("PayPal payment: " + amount + " processed successfully!");
    }
}
