package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Restaurant implements Serializable{

    private static final long serialVersionUID = 1L;

    private List<Product> theProduct;

    private String name;
    private String id;
    private String nameOfAdministrator;


    public Restaurant(String name, String id, String nameOfAdministrator) {
        this.name = name;
        this.id = id;
        this.nameOfAdministrator = nameOfAdministrator;
        theProduct = new ArrayList<>();

        theProduct.add(new Product("4657", "crepes de queso", "crepes cubierto de queso", 8000, "12345678", 3));
        theProduct.add(new Product("47578", "sushi", "sushi", 9000, "12345", 3));
        theProduct.add(new Product("576889", "pollo a la naranja", "pollo cocinado con jugo de naranja", 8000, "123456", 3));
        theProduct.add(new Product("58678", "mini waffles con chocolate", "mini waffles con salsa de chocolate", 8000, "1234567", 3));


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

    public void bubbleSortProduct() {
        for (int i = 0; i < theProduct.size()-1; i++) {
            for (int j = 0; j < theProduct.size()-i-1; j++) {
                Product n1 = theProduct.get(j);
                Product n2 = theProduct.get(j+1);
                if(n1.compareTo(n2)) {
                    theProduct.set(j, n2);
                    theProduct.set(j+1, n1);
                }
            }
        }
    }










}