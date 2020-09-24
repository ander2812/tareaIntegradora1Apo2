package model;
import java.util.ArrayList;
import java.util.List;
public class Restaurant{
    private List<Product> theProduct;

    private String name;
    private String id;
    private String nameOfAdministrator;


    public Restaurant(String name, String id, String nameOfAdministrator) {
        this.name = name;
        this.id = id;
        this.nameOfAdministrator = nameOfAdministrator;
        theProduct = new ArrayList<>();

        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfAdministrator() {
        return nameOfAdministrator;
    }

    public void setNameOfAdministrator(String nameOfAdministrator) {
        this.nameOfAdministrator = nameOfAdministrator;
    }


    public List<Product> getTheProduct() {
        return theProduct;
    }

    public void setTheProduct(List<Product> theProduct) {
        this.theProduct = theProduct;
    }

    public void addProduct(Product product){
        theProduct.add(product);
    }


    
    

    
    
    
}