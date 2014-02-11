
import java.util.ArrayList;


/**
 *
 * @author Michael Santer
 */
class Post {
    private Store store;
    
    public Post(Store store){
        this.store = store;
    }
    
    public void transact(TransactionRecord transaction) throws Exception {
        double total = 0.;
        ArrayList<Item> items = transaction.getItems();
        
        //1. make sure items exist in catalog
        for(Item item : items){
            if(!store.hasProduct(item.getUPC()))
                throw new Exception("UPC not found!");
            
            //2. calculate total
            total += store.getProduct(item.getUPC()).getPrice();
        }
        
        //3. process payment
        double amount = transaction.getPayment().processPayment(total);
        
        //4. save transactionRecord to store's transactionHistory
        store.saveTransaction(transaction);
        
        //5. print invoice
        Invoice invoice = new Invoice(transaction, total, store);
        invoice.setAmountReturned(amount);
        invoice.print();
    }
    
}
