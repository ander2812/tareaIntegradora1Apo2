package model;

import exception.ClientNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    private List<Restaurant> theRestaurants;
    private List<Client> theClients;
    private List<Order> theOrders;

    public App() {
        theClients = new ArrayList<>();
        theRestaurants = new ArrayList<>();
        theOrders = new ArrayList<>();
        theClients.add(new Client("paola", "cc", "454667", "365767", "aasdf"));
        theClients.add(new Client("Arturo", "cc", "5757578", "5657688", "aasdf"));
        theClients.add(new Client("Andrea", "cc", "464657", "6455667", "aasdf"));
        theClients.add(new Client("Julian", "cc", "56476779", "574656768", "aasdf"));

        theRestaurants.add(new Restaurant("crepes", "12345678", "Andrea"));
        theRestaurants.add(new Restaurant("wafles", "123456", "Paola"));
        theRestaurants.add(new Restaurant("sr wok", "1234567", "Andrea"));
        theRestaurants.add(new Restaurant("sushi", "12345", "Andrea"));

    }

    public void addClient(String name, String typeId, String id, String telephone, String address) {

        Client client = new Client(name, typeId, id, telephone, address);

        theClients.add(client);
        sortByClientName();

    }

    public void addProductToARestaurant(String restarantId, Product theNewProduct) {

        for (Restaurant theRestaurant : theRestaurants) {
            if (theRestaurant.getId().equals(restarantId)) {
                theRestaurant.addProduct(theNewProduct);
            }
        }

    }

    public void addOrders(Order theNewOrder) {

        this.theOrders.add(theNewOrder);

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
        theRestaurants.sort(nc);
    }

    public void sortByTelephone() {
        Collections.sort(theClients);
    }

    public void sortByClientName() {
        Comparator<Client> cn;

        cn = (n1, n2) -> {
            int comp;
            comp = n1.compareTo(n2);
            return comp;
        };

        theClients.sort(cn);
    }



        public void searchClientLog(String name) throws ClientNotFoundException {

            long startTime = System.currentTimeMillis();
            Client client;
            String varShow = "";
            theClients.sort(new ClientSortbyName());

            boolean found = false;
            int start = 0;
            int end = theClients.size();

            while (start <= end && !found) {
                int meidum = (start + end) / 2;

                if (meidum != theClients.size()) {
                    String elementMedium = theClients.get(meidum).getName();
                    int resultComparation = name.compareToIgnoreCase(elementMedium);
                    if (resultComparation == 0) {
                        found = true;
                        client = theClients.get(meidum);
                        varShow = "Client name : " + client.getName() + "\n" +
                                "ID type : " + client.getTypeId() + "\n" +
                                "ID number client : " + client.getClientId() + "\n" +
                                "Thelephone number : " + client.getTelephone() + "\n" +
                                "Address : " + client.getAddress() + "\n"
                        ;

                    } else if (resultComparation < 0) {
                        end = meidum - 1;
                    } else {
                        start = meidum + 1;
                    }
                }
            }
            System.out.println(varShow);

            if (!found) {
                throw new ClientNotFoundException(name);
            }

            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);

            System.out.println("the search duration is: " + duration);

        }




}
