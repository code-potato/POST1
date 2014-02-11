
/**
 *
 * @author Michael Santer
 */
class Post {
    private Store store;
    
    public Post(Store store){
        this.store = store;
    }
    
    public void transact(TransactionRecord transaction) {
        //1. make sure items exist in catalog
        //2. calculate total
        //3. process payment
        //4. save transactionRecord to store's transactionHistory
        //5. print invoice
    }
    
}
