
/**
 *
 * @author Michael Santer
 * 
 * The Manager class is responsible for opening the store, initializing 
 * all POSTs, and loading the Product Catalog. 
 * 
 */
public class Manager {
    private Store store;
    
    public Manager(){}
    
    public void openStore(String storeName) throws Exception{
        if(store != null){
            throw new Exception("Store is already open!");
        }
        store = new Store(storeName);
    }
    
    public void setupProductCatalog(String prodcutCatalogFile){
    }
    
    public POST getPost() throws Exception{
        if(store == null){
            throw new Exception("Store is already open!");
        }
        return store.getPost();
    }
    
    
    public static void main(String args[]){
        Manager manager = new Manager();
        PostUI ui = new PostUI(manager);
        ui.run(manager);
    }
    
    
}


