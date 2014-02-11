package Post;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Santer
 */
class CheckPayment extends Payment {

    public CheckPayment() {
    }

    @Override
    public double processPayment(double total) {
        return this.getAmount() - total;
    }
    
}
