package ui;

import model.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Update {
    Main main;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Client client = new Client("", "", "", "", "");
    Restaurant myRestaurant = new Restaurant("", "", "");

    public Update() {

    }

    public void updateInformationClient() throws NumberFormatException, IOException {
        System.out.println("please enter the ID of the client you want update");
        String clientId2 = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < 1; i++) {

            if (clientId2.equalsIgnoreCase(myRestaurant.getTheClients().get(i).getClientId())) {

                System.out.println(
                        "please enter the information of the client you want to update \n\n (1) name \n (2) type ID \n (3) client ID \n (4) telephone \n (5) address");
                int opt = Integer.parseInt(br.readLine());

                switch (opt) {
                    case 1:
                        System.out.println("enter the new name");
                        String name = br.readLine();
                        myRestaurant.getTheClients().get(i).setName(name);
                        System.out.println("the client information is update successfully");

                        break;

                    case 2:
                        System.out.println("enter the new type ID");
                        String typeId = br.readLine();
                        myRestaurant.getTheClients().get(i).setTypeId(typeId);
                        System.out.println("the client information is update successfully");
                        break;

                    case 3:
                        System.out.println("enter the new client ID");
                        String clientId = br.readLine();
                        myRestaurant.getTheClients().get(i).setClientId(clientId);
                        System.out.println("the client information is update successfully");
                        break;

                    case 4:
                        System.out.println("enter the new telephone");
                        String telephone = br.readLine();
                        myRestaurant.getTheClients().get(i).setTelephone(telephone);
                        System.out.println("the client information is update successfully");
                        break;

                    case 5:
                        System.out.println("enter the new address");
                        String address = br.readLine();
                        myRestaurant.getTheClients().get(i).setAddress(address);
                        System.out.println("the client information is update successfully");
                        break;

                }
            } else if (clientId2 != myRestaurant.getTheClients().get(i).getClientId()) {
                System.out.println("client ID is not fund");
            }

        }

    }

    public void updateInformationRestaurant() throws NumberFormatException, IOException {
        System.out.println("please enter the ID of the restaurant you want update");
        String id2 = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < 1; i++) {

            if (id2.equalsIgnoreCase(myRestaurant.getTheRestaurant().get(i).getId())) {

                System.out.println(
                        "please enter the information of the restaurant you want to update \n\n (1) name \n (2) ID \n (3) name of administrator");
                int opt = Integer.parseInt(br.readLine());

                switch (opt) {
                    case 1:
                        System.out.println("enter the new name");
                        String name = br.readLine();
                        myRestaurant.getTheRestaurant().get(i).setName(name);
                        System.out.println("the restaurant information is update successfully");

                        break;

                    case 2:
                        System.out.println("enter the new ID");
                        String id = br.readLine();
                        myRestaurant.getTheRestaurant().get(i).setId(id);
                        ;
                        System.out.println("the restaurant information is update successfully");
                        break;

                    case 3:
                        System.out.println("enter the new name of administrator");
                        String nameOfAdministrator = br.readLine();
                        myRestaurant.getTheRestaurant().get(i).setNameOfAdministrator(nameOfAdministrator);
                        ;
                        System.out.println("the restaurant information is update successfully");
                        break;

                }

            } else if (id2 != myRestaurant.getTheClients().get(i).getClientId()) {
                System.out.println("restaurant ID is not fund");
            }

        }

    }

    public void updateInformationProduct() throws NumberFormatException, IOException {
        System.out.println("please enter the ID of the client you want update");
        String clientId2 = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < 1; i++) {

            if (clientId2.equalsIgnoreCase(myRestaurant.getTheClients().get(i).getClientId())) {

                System.out.println(
                        "please enter the information of the product you want to update \n\n (1) code \n (2) name \n (3) description \n (4) coste \n (5) idOfRestaurant");
                int opt = Integer.parseInt(br.readLine());

                switch (opt) {
                    case 1:
                        System.out.println("enter the new code");
                        String code = br.readLine();
                        myRestaurant.getTheProduct().get(i).setCode(code);
                        System.out.println("the product information is update successfully"); 

                        break;

                    case 2:
                        System.out.println("enter the new name");
                        String name = br.readLine();
                        myRestaurant.getTheProduct().get(i).setName(name);
                        System.out.println("the product information is update successfully");
                        break;

                    case 3:
                        System.out.println("enter the new description");
                        String description = br.readLine();
                        myRestaurant.getTheProduct().get(i).setDescription(description);
                        System.out.println("the product information is update successfully");
                        break;

                    case 4:
                        System.out.println("enter the new coste");
                        double coste = Double.parseDouble(br.readLine());
                        myRestaurant.getTheProduct().get(i).setCoste(coste);
                        System.out.println("the product information is update successfully");
                        break;

                    case 5:
                        System.out.println("enter the new ID of restaurant");
                        String idOfRestaurant = br.readLine();
                        myRestaurant.getTheProduct().get(i).setIdOfRestaurant(idOfRestaurant);
                        System.out.println("the product information is update successfully");
                        break;

                }

            } else if (clientId2 != myRestaurant.getTheClients().get(i).getClientId()) {
            }
            System.out.println("product ID is not fund");
        }
    }

    public void updateInformationOrder() throws NumberFormatException, IOException {
        System.out.println("please enter the ID of the order you want update");
        String orderCode2 = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < 1; i++) {

            if (orderCode2.equalsIgnoreCase(myRestaurant.getTheClients().get(i).getTheOrders().get(i).getOrderCode())) {

                System.out.println(
                        "please enter the information of the order you want to update \n\n (1) order code \n (2) client ID \n (3) restaurant ID \n (4) order status");
                int opt = Integer.parseInt(br.readLine());

                switch (opt) {
                    case 1:
                        System.out.println("enter the new order code");
                        String orderCode = br.readLine();
                        myRestaurant.getTheClients().get(i).getTheOrders().get(i).setOrderCode(orderCode);
                        System.out.println("the order information is update successfully");

                        break;

                    case 2:
                        System.out.println("enter the new client ID");
                        String clientId = br.readLine();
                        myRestaurant.getTheClients().get(i).getTheOrders().get(i).setClientId(clientId);
                        System.out.println("the order information is update successfully");
                        break;

                    case 3:
                        System.out.println("enter the new restaurant ID");
                        String restaurantId = br.readLine();
                        myRestaurant.getTheClients().get(i).getTheOrders().get(i).setRestaurantId(restaurantId);
                        System.out.println("the client information is update successfully");
                        break;

                }
            } else if (orderCode2 != myRestaurant.getTheClients().get(i).getClientId()) {
                System.out.println("client ID is not fund");
            }

        }

    }

}