/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Santer
 */
abstract class Payment {
    private double amount;
    
    abstract public void processPayment();

    void setAmount(Double amount) {
        this.amount = amount;
    }
}
