
/**
 *
 * @author Michael Santer
 */
class Customer {
    private String firstName, lastName;
    
    /**
     * Constructor of customer is private. A new customer can only be 
     * instantiated by calling the class method "createTransaction". This 
     * enforces the schema that a customer must initiate a transaction. 
     * 
     * @param firstName
     * @param lastName 
     */
    private Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    /**
     * This method instantiates a new customer and a new transaction. Using
     * transaction reader, it builds a transactionRecord to be used by POST. 
     * @return 
     */
    public static TransactionRecord createTransaction(){
        return null;
    }
    
}
