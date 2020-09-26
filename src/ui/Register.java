package ui;

import model.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;
import exception.DocNumberException;
import exception.TypeDocumentException;

public class Register {
    Main main;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    App application;

    public Register(App application) {
        this.application = application;
        application = App.getInstance();

    }

    public void regClient() throws IOException {
        System.out.println("Please enter customer date");
        System.out.println(" ");

        System.out.println("whats is the client's name?");
        String name = br.readLine();
        System.out.println("whats is the client's id?");
        String id = br.readLine();
        System.out.println("whats is the client's type id?");
        String typeId = br.readLine();
        System.out.println("whats is the client's telephone?");
        String telephone = br.readLine();
        System.out.println("whats is the client's address?");
        String address = br.readLine();

        application.addClient(name, typeId, id, telephone, address);

        System.out.println("the client has been register successfully");
        System.out.println(" ");
    }

    public void registerProduct() throws NumberFormatException, IOException {
        System.out.println("Please enter customer date");
        System.out.println(" ");
        System.out.println("Please enter the ID of the restaurant to which you want to add product?");
        String restaurantId = br.readLine();
        System.out.println("whats is the code product's?");
        String code = br.readLine();
        System.out.println("whats is the name product's?");
        String name = br.readLine();
        System.out.println("whats is the description product's?");
        String description = br.readLine();
        System.out.println("whats is the coste product's?");
        double coste = Double.parseDouble(br.readLine());
        System.out.println("whats is the quantity product's?");
        int quantity = Integer.parseInt(br.readLine());
        System.out.println(" ");

        Product theNewProduct = new Product(code, name, description, coste, restaurantId, quantity);

        application.addProductToARestaurant(restaurantId, theNewProduct);

    }

    public void regOrder() throws NumberFormatException, IOException {
        System.out.println("How many orders do you want to register?");
        int opt = Integer.parseInt(br.readLine());
        String orderStatus = " ";

        for (int i = 0; i < opt; i++) {
            String orderCode = String.valueOf((int) (1000000 * Math.random()));

            Date date = new Date();

            System.out.println("Enter the client's document: ");
            String clientId = br.readLine();
            System.out.println("Enter the ID of the restaurant");
            String restaurantId = br.readLine();

            System.out.println("Enter dof order status");
            System.out.println("(1).REQUESTED");
            System.out.println("(2).IN PROCESS");
            System.out.println("(3).SENT");
            System.out.println("(4).DElIVERED");

            opt = Integer.parseInt(br.readLine());

            if (opt == 1) {
                orderStatus = "Requested";
            } else if (opt == 2) {
                orderStatus = "Process";
            } else if (opt == 3) {
                orderStatus = "Sent";
            } else if (opt == 4) {
                orderStatus = "Delivered";
            }
            Order theNewOrder = new Order(orderCode, orderStatus, date, clientId, restaurantId);
            application.addOrders(theNewOrder);
        }
    }

    public void registerRestaurant() throws NumberFormatException, IOException {

        System.out.println("Please enter restaurant date");
        System.out.println(" ");

        System.out.println("whats is the restaurant's name?");
        String name = br.readLine();
        System.out.println("whats is the restaurant's id?");
        String id = br.readLine();
        System.out.println("whats is the restaurant's name of administrator?");
        String nameOfAdministrator = br.readLine();

        Restaurant theNRestaurant = new Restaurant(name, id, nameOfAdministrator);

        application.addRestaurant(theNRestaurant);

        System.out.println("the restaurant has been register successfully");
        System.out.println(" ");
    }

    public void restaurantList() {
        application.sortByName();
        for (int i = 0; i < application.getTheRestaurants().size(); i++) {
            Restaurant restaurant = application.getTheRestaurants().get(i);

            System.out.println("the restaurant's name is: " + restaurant.getName());
            System.out.println("the restaurant's id is: " + restaurant.getId());
            System.out.println("the restaurant's name of administrator is: " + restaurant.getNameOfAdministrator());
            System.out.println(" ");

        }
    }

    public void productList() {

        for (int i = 0; i < application.getTheRestaurants().size(); i++) {
            for (int j = 0; j < application.getTheRestaurants().get(i).getTheProduct().size(); j++) {
                Product product = application.getTheRestaurants().get(i).getTheProduct().get(j);

                System.out.println("the products's name is: " + product.getName());
                System.out.println("the product's code is: " + product.getCode());
                System.out.println("the products's especification is: " + product.getDescription());
                System.out.println("the product's coste is: " + product.getCoste());
                System.out.println(" ");

                application.getTheRestaurants().get(i).bubbleSortProduct();

            }

        }

    }

    public void clientList() {
        application.sortByTelephone();
        for (int i = 0; i < application.getTheClients().size(); i++) {
            Client client = application.getTheClients().get(i);

            System.out.println("the client's name is: " + client.getName());
            System.out.println("the client's id is: " + client.getClientId());
            System.out.println("the client's type ID is: " + client.getTypeId());
            System.out.println("the clients telephone is : " + client.getTelephone());
            System.out.println("the clients addres is: " + client.getAddress());
            System.out.println(" ");

        }
    }

    public void searchClient() throws IOException {

        double startTime = System.currentTimeMillis();

        System.out.println("enter the client ID to search");
        String name = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < application.getTheClients().size(); i++) {

            if (name.equals(application.getTheClients().get(i).getClientId())) {

                System.out.println("the search client is: ");
                System.out.println(" ");

                Client client = application.getTheClients().get(i);

                System.out.println("the client's name is: " + client.getName());
                System.out.println("the client's id is: " + client.getClientId());
                System.out.println("the client's type ID is: " + client.getTypeId());
                System.out.println("the clients telephone is : " + client.getTelephone());
                System.out.println("the clients addres is: " + client.getAddress());
                System.out.println(" ");

                double endTime = System.currentTimeMillis();
                double duration = (endTime - startTime);

                System.out.println("the search duration is: " + duration);

            }

        }

    }

}