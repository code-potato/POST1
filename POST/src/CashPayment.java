/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Santer
 */
class CashPayment extends Payment {

    public CashPayment() {
    }

    @Override
    public double processPayment(double total) {
        return this.getAmount() - total;
    }
    
}
