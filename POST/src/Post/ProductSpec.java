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
public class ProductSpec {
    private String UPC;
    private String description;
    private float price;
    
    public ProductSpec(){
    }
    
    public void setUPC(String UPC){ 
        this.UPC = UPC;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setPrice(float price){
        this.price = price;
    }

    public String getUPC() {
        return UPC;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
    
    

}
