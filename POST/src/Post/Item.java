package Post;

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

    public void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getUPC(){
        return productSpec.getUPC();
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public float getPrice(){
        return productSpec.getPrice();
    }
    
    public String getDescription(){
        return productSpec.getDescription();
    }
    

    
}
