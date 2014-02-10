
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Michael Santer
 */
class TransactionRecord {
    
    private Customer customer;
    private Payment payment;
    private ArrayList<Item> items;
    private Date dateAndTime;
    
    /**
     * A TransactionRecord must be instantiated with a customer. This helps to 
     * enforce, along with the privatizing of the customer constructor, that 
     * only a customer should start a transaction. 
     * @param customer 
     */
    public TransactionRecord(Customer customer){
        //set date and time to current date and time
        dateAndTime = new Date();
        this.customer = customer;
    }

    public String getCustomerFirstName() {
        return customer.getFirstName();
    }
    
    public String getCustomerLastName() {
        return customer.getLastName();
    }

    public Date getDateandTime() {
        return dateAndTime;
    }
}
