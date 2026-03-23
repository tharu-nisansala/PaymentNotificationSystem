/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.payment;

/**
 *
 * @author Acer
 */

/**
 * Target Interface (Adapter Pattern)
 * Defines a common method for all payment types
 */
public interface PaymentProcessor {
    void processPayment(double amount);

}
