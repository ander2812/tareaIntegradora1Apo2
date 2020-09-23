package model;
import java.util.ArrayList;
import java.util.List;
public class Restaurant{
    private List<Client> theClients;
    private List<Product> theProduct;
    private List<Restaurant> theRestaurant;

    private String name;
    private String id;
    private String nameOfAdministrator;


    public Restaurant(String name, String id, String nameOfAdministrator) {
        this.name = name;
        this.id = id;
        this.nameOfAdministrator = nameOfAdministrator;
        theClients = new ArrayList<>();
        theProduct = new ArrayList<>();
        theRestaurant = new ArrayList<>();
        theClients.add(new Client("paola", "cc", "12345", "12345", "aasdf"));
        theClients.add(new Client("Arturo", "cc", "123456", "12345", "aasdf"));
        theClients.add(new Client("Andrea", "cc", "1234567", "12345", "aasdf"));
        theClients.add(new Client("Julian", "cc", "12345678", "12345", "aasdf"));

        
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

    public void addClient(String name, String typeId, String id, String telephone, String address ){

        Client client = new Client(name, typeId, id, telephone, address);

        theClients.add(client);

        
    }

    public List<Client> getTheClients() {
        return theClients;
    }

    public void setTheClients(List<Client> theClients) {
        this.theClients = theClients;
    }

    public List<Product> getTheProduct() {
        return theProduct;
    }

    public void setTheProduct(List<Product> theProduct) {
        this.theProduct = theProduct;
    }

    public void addProduct(String code, String name, String description, double coste, String idOfRestaurant, int quantity){
        Product product = new Product(code, name, description, coste, idOfRestaurant, quantity);
        theProduct.add(product);
    }

    public List<Restaurant> getTheRestaurant() {
        return theRestaurant;
    }

    public void setTheRestaurant(List<Restaurant> theRestaurant) {
        this.theRestaurant = theRestaurant;
    }

    public void addRestaurant(String name, String id, String nameOfAdministrator){
        Restaurant restaurant = new Restaurant(name, id, nameOfAdministrator);
        theRestaurant.add(restaurant);
    }
    

    
    
    
}