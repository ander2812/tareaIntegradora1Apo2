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

    public Register() {
        myRestaurant.getTheRestaurant().add(new Restaurant("sr wook", "12345", "paola"));
        myRestaurant.getTheRestaurant().add(new Restaurant("crepes", "123456", "Andrea"));
        myRestaurant.getTheRestaurant().add(new Restaurant("sushi", "1234567", "Arturo"));
        myRestaurant.getTheRestaurant().add(new Restaurant("wafles", "12345678", "julian"));

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

            myRestaurant.addClient(name, typeId, id, telephone, address);

            System.out.println("the client has been register successfully");
            System.out.println(" ");

        }

        for (int i = 0; i < myRestaurant.getTheClients().size(); i++) {
            Client myClients = myRestaurant.getTheClients().get(i);
            System.out.println("the name of client is: " + myClients.getName());
            System.out.println("the id of client is: " + myClients.getClientId());
            System.out.println("the type of client is: " + myClients.getTypeId());
            System.out.println(" ");

        }
        bw.close();
        br.close();
    }

    public void registerProduct() throws NumberFormatException, IOException {
        System.out.println("Please enter customer date");
        System.out.println(" ");
        System.out.println("Please enter the ID of the restaurant to which you want to add product?");
        String idOfRestaurant = br.readLine();
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

        for (int i = 0; i < myRestaurant.getTheRestaurant().size(); i++) {

            if (idOfRestaurant.equalsIgnoreCase(myRestaurant.getTheRestaurant().get(i).getId())) {

                myRestaurant.getTheRestaurant().get(i).addProduct(code, name, description, coste, idOfRestaurant,
                        quantity);

                System.out.println("the product has been register successfully");

            }

           
        }

        for (int i = 0; i < myRestaurant.getTheProduct().size(); i++) {
            
            System.out.println(" ");
            Product product = myRestaurant.getTheRestaurant().get(i).getTheProduct().get(i);
            System.out.println("the code of product is: " + product.getCode());
            System.out.println("the name of product is: " + product.getName());
            System.out.println("the description of product is: " + product.getDescription());
            System.out.println(" ");
            
        }

    }

    public void regOrder() throws IOException {
        System.out.println("please enter how many order you want to add");
        int opt = Integer.parseInt(br.readLine());
        System.out.println("Please enter order date");
        System.out.println(" ");

        for (int i = 0; i < opt; i++) {

            String orderCode = String.valueOf((int) (10000000 * Math.random()));
            System.out.println("whats is the id client's?");
            String clientId = br.readLine();
            System.out.println("whats is the status order's?");
            String orderStatus = br.readLine();
            System.out.println("whats is the id restaurant's?");
            String restaurantId = br.readLine();
            Date date = new Date();

            myRestaurant.getTheClients().get(i).addOrder(orderCode, orderStatus, date, clientId, restaurantId);

            System.out.println("the restaurant has been register successfully");

        }

    }

    public void registerRestaurant() throws NumberFormatException, IOException {

        System.out.println("please enter how many restaurants you want to add");
        int opt = Integer.parseInt(br.readLine());
        for (int i = 0; i < opt; i++) {
            System.out.println("Please enter restaurant date");
            System.out.println(" ");

            System.out.println("whats is the restaurant's name?");
            String name = br.readLine();
            System.out.println("whats is the restaurant's id?");
            String id = br.readLine();
            System.out.println("whats is the restaurant's name of administrator?");
            String nameOfAdministrator = br.readLine();

            myRestaurant.addRestaurant(name, id, nameOfAdministrator);

            System.out.println("the restaurant has been register successfully");
            System.out.println(" ");

        }

        for (int i = 0; i < myRestaurant.getTheRestaurant().size(); i++) {
            Restaurant theRestaurant = myRestaurant.getTheRestaurant().get(i);
            System.out.println("the name of restaurant is: " + theRestaurant.getName());
            System.out.println("the id of restaurant is: " + theRestaurant.getId());
            System.out.println("the name of administrator is: " + theRestaurant.getNameOfAdministrator());

            System.out.println(" ");

        }

    }

    public void updateOrderStatus() throws IOException {
        System.out.println("please enter the code order's");
        String orderCode = br.readLine();
        System.out.println("please enter the status order's");
        String orderStatus = br.readLine();

        for (int i = 0; i < myRestaurant.getTheClients().get(i).getTheOrders().size(); i++) {

            if (orderCode.equalsIgnoreCase(myRestaurant.getTheClients().get(i).getTheOrders().get(i).getOrderCode())) {
                myRestaurant.getTheClients().get(i).getTheOrders().get(i).setOrderStatus(orderStatus);
                System.out.println("the order status has been changed successfully");
            }

        }

    }

}