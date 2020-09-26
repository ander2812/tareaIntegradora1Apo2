package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class App {
    private List<Restaurant> theRestaurants;
    private List<Client> theClients;
    private List<Order> theOrders;
    private static App application;

    public App() {
        theClients = new ArrayList<>();
        theRestaurants = new ArrayList<>();
        theClients.add(new Client("paola", "cc", "454667", "365767", "aasdf"));
        theClients.add(new Client("Arturo", "cc", "5757578", "5657688", "aasdf"));
        theClients.add(new Client("Andrea", "cc", "464657", "6455667", "aasdf"));
        theClients.add(new Client("Julian", "cc", "56476779", "574656768", "aasdf"));

        theRestaurants.add(new Restaurant("crepes", "12345678", "Andrea"));
        theRestaurants.add(new Restaurant("wafles", "123456", "Paola"));
        theRestaurants.add(new Restaurant("sr wok", "1234567", "Andrea"));
        theRestaurants.add(new Restaurant("sushi", "12345", "Andrea"));

    }

    public static App getInstance() {
        if (application == null) {
            application = new App();
       }
        return application;
    }

    public void addClient(String name, String typeId, String id, String telephone, String address) {

        Client client = new Client(name, typeId, id, telephone, address);

        theClients.add(client);
        sortByClientName();

    }

    public void addProductToARestaurant(String restarantId, Product theNewProduct) {

        for (int i = 0; i < theRestaurants.size(); i++) {
            if (theRestaurants.get(i).getId().equals(restarantId)) {
                theRestaurants.get(i).addProduct(theNewProduct);
            }
        }

    }

    public void addOrders(Order theNewOrder) {

        theOrders.add(theNewOrder);

    }

    public void addRestaurant(Restaurant theNewRestaurant) {
        theRestaurants.add(theNewRestaurant);

    }

    public List<Restaurant> getTheRestaurants() {
        return theRestaurants;
    }

    public void setTheRestaurants(List<Restaurant> theRestaurants) {
        this.theRestaurants = theRestaurants;
    }

    public List<Client> getTheClients() {
        return theClients;
    }

    public void setTheClients(List<Client> theClients) {
        this.theClients = theClients;
    }

    public List<Order> getTheOrders() {
        return theOrders;
    }

    public void setTheOrders(List<Order> theOrders) {
        this.theOrders = theOrders;
    }

    public void sortByName() {
        NameComparator nc = new NameComparator();
        Collections.sort(theRestaurants, nc);
    }

    public void sortByTelephone() {
        Collections.sort(theClients);
    }

    public void sortByClientName() {
        Comparator<Client> cn;

        cn = new Comparator<Client>() {
            public int compare(Client n1, Client n2) {
                int comp;
                comp = n1.compareTo(n2);
                return comp;
            }
        };

        Collections.sort(theClients, cn);
    }

   


}


