/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Item {
    private ProductSpec productSpec;
    private int quantity;
    
    public Item(){
        
    }

    void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
}
