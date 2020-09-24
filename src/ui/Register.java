package ui;

import model.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class Register {
    Main main;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Client client = new Client("", "", "", "", "");
    Restaurant myRestaurant = new Restaurant("", "", "");
    App application;

    public Register(App application) {
        this.application = application;

    }

    public void regClient() throws IOException {
        System.out.println("please enter how many clients you want to add");
        int opt = Integer.parseInt(br.readLine());
        for (int i = 0; i < opt; i++) {
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
        bw.close();
        br.close();
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

    public void regOrder() throws IOException {
       
        System.out.println("Please enter order date");
        System.out.println(" ");

        String orderCode = String.valueOf((int) (10000000 * Math.random()));
        System.out.println("whats is the id client's?");
        String clientId = br.readLine();
        System.out.println("whats is the status order's?");
        String orderStatus = br.readLine();
        System.out.println("whats is the id restaurant's?");
        String restaurantId = br.readLine();
        Date date = new Date();

        Order theNewOrder = new Order(orderCode, orderStatus, date, clientId, restaurantId);

       application.addOrder(theNewOrder);

    }

    public void registerRestaurant() throws NumberFormatException, IOException {

        System.out.println("please enter how many restaurants you want to add");
        int opt = Integer.parseInt(br.readLine());

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

}