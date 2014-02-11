
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Santer
 */
public class Invoice {
    TransactionRecord transaction;
    Double total, amountReturned;
    Store store;
    
    public Invoice(TransactionRecord transaction,double total, Store store){
        this.transaction = transaction;
        this.store= store;
        this.total = total;
    }
    
    public String toString(){
        String invoice = store.getName() + "\n\n";
        invoice += transaction.getCustomerFirstName();
        if(transaction.getCustomerLastName() != null)
            invoice += " " + transaction.getCustomerLastName();
        invoice += "\t" + transaction.getDateAndTime() + "\n";
        
        ArrayList<Item> items = transaction.getItems();
        for(Item item : items){
            double price = store.getProduct(item.getUPC()).getPrice();
            invoice += store.getProduct(item.getUPC()).getDescription() +"\t"+ 
                    item.getQuantity()+"\t"+ String.format("$%.2f\t$%.2f", price, 
                        price*item.getQuantity()) + "\n";
        }
        invoice += "-------------------------------------\n";
        invoice += "Total: $" + String.format("%.2f\n",total);
        if(transaction.getPayment() instanceof CashPayment ||
                transaction.getPayment() instanceof CheckPayment)
            invoice += "Amount Tendered: $" + transaction.getPayment().getAmount() 
                    + "\nAmount Returned: $" + String.format("%.2f", amountReturned);
        else
            invoice += "Paid by Credit Card\n";
        return invoice;
    }

    public void print() {
        System.out.println(this);
    }

    void setAmountReturned(double amount) {
        amountReturned = amount;
    }
    
    
    
    
}
