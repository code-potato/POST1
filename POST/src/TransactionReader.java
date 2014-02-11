import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Michael Santer
 */
class TransactionReader {
    private BufferedReader reader;
    private StringTokenizer tok;
    
    public TransactionReader(String transactFile) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(transactFile));
    }

    public boolean hasMoreTransactions() {
        try {
            if(reader.readLine() == null){
                return false;
            }
        } catch (IOException ex) {
            System.out.println("AAAAAhhhhhh");
        }
        return true;
    }

    public TransactionRecord getNextTransaction(Customer customer) throws IOException {
        TransactionRecord transaction;
        
        //read first line to get customer name
        String name = reader.readLine();
        tok = new StringTokenizer(name);
        
        //parse customer name into first and last
        try{
            customer.setFirstName(tok.nextToken());
            customer.setLastName(tok.nextToken());
        }
        catch(NoSuchElementException ex){
            //do nothing. name is not necessary
        }
        
        //create new transaction with constructed customer
        transaction = new TransactionRecord(customer);
        
        //read subsequent lines
        String next = reader.readLine();
        while(next != null && !next.isEmpty() ){
            tok = new StringTokenizer(next);
            Item item = new Item();
            ProductSpec product = new ProductSpec();
            
            
            //if next line doesn't specify a payment, it must specify and item
            if(!next.contains("CASH") && !next.contains("CHECK") && !next.contains("CREDIT")){
                //set upc of item
                product.setUPC(tok.nextToken());
                item.setProductSpec(product);
                
                //try to get quantity
                if(tok.hasMoreTokens()) 
                    item.setQuantity(Integer.parseInt(tok.nextToken()));
                else
                    item.setQuantity(1); 
                
                //add item to transaction
                transaction.addItem(item);
            }

            //if next line does specify a payment, record payment
            else{
                Payment pay = new Payment();
                //***fill in data for building payment object
                transaction.setPayment(pay);
            }
            next = reader.readLine();
        }
        
        
        return transaction;
    }
    
}
