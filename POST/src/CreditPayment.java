/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Santer
 */
class CreditPayment extends Payment {

    private int accountNumber;
    
    public CreditPayment() {
    }

    CreditPayment(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment() {
        
    }    
    
}
