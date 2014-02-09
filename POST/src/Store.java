
/**
 *
 * @author Michael Santer
 */
public class Store {
    private String name;
    private Post post;
    
    public Store(String name){
        this.name = name;
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
        post = new Post();
    }
            
}
