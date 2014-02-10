
/**
 *
 * @author Michael Santer
 */
class Customer {
    private String firstName, lastName;
    
    /**
     * Constructor of customer is private. A new customer can only be 
     * instantiated by calling the class method "getTransactions". This 
     * enforces the schema that a customer must initiate a transaction.  
     */
    private Customer(){
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    /**
     * This method instantiates a new customer and a new transaction for every
     * transaction record in the file. Using transaction reader, it builds a 
     * transactionRecord, and hands off to post to process transaction.  
     * @return 
     */
    public static void getTransactions(String transactFile, Post post){
        TransactionReader reader = new TransactionReader(transactFile);
        
        while(reader.hasMoreTransactions()){
            //Instantiate empty customer
            Customer customer = new Customer();
            
            //Construct transactionRecord for customer
            TransactionRecord transaction = reader.getNextTransaction(customer);
            
            //Request POST to process the transaction
            post.transact(transaction);
        }
    }
    
}
