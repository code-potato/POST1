
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael Santer
 * 
 * PostUI handles all user interfacing. Communicates between Manager and Post 
 */
public class PostUI {
    private Manager manager;
    private POST post;
    
    public PostUI(Manager manager){
        this.manager = manager;
    }
    
    public void run(Manager manager){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to the point of sale terminal (POST)!");
        
        //Get name of store and ask manager to open store and init post. 
        System.out.print("Please enter the name of the store: ");
        try {
            manager.openStore(in.nextLine());
            post = manager.getPost();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        //Get name of product catalog and ask manager to initialize it. 
        System.out.print("Please enter name of Product Catalog file: ");
        manager.setupProductCatalog(in.nextLine());
        
        //Get transaction file name and pass off to (file reader?)
        //  (eventually this should be a loop)  //
        System.out.print("Please enter a transaction filename: ");
        
        
    } 
}
