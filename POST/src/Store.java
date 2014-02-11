
/**
 *
 * @author Michael Santer
 */
public class Store {
    private String name;
    private Post post;
    private ProductCatalog productCatalog;
    
    public Store(String name){
        this.name = name;
        productCatalog = new ProductCatalog();
        
    }
    
    public Post getPost(){
        return post;
    }

    /**
     * Creates a new POST. 
     * @throws Exception if POST is already initialized. 
     */
    public void newPost() throws Exception {
        if (post != null)
            throw new Exception("Post already exists!");
        post = new Post(this);
    }
    
    public void addProductToCatalog(){
        
    }
    
            
}
