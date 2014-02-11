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
            String temp = tok.nextToken();
            int upc; 
            int quantity = 1;
            Item item = new Item();
            try{
                //if line starts with a number, its an item description 
                upc = Integer.parseInt(temp); //will throw exception if not a number
                //try to get quantity
                if(tok.hasMoreTokens()){
                    temp = tok.nextToken();
                    quantity = Integer.parseInt(temp);
                }
                
            }
            catch(NumberFormatException ex){
                Payment pay = new Payment();
                //if line does not start with a number, its a payment description
                
                //fill in data for building payment object
                transaction.setPayment(pay);
            }
            
            next = reader.readLine();
        }
        
        
        return transaction;
    }
    
}
