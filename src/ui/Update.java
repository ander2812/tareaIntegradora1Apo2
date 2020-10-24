package ui;

import model.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Update {
    Main main;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    App application;

    public Update(App application) {
        this.application = application;

    }

    public void updateInformationClient() throws NumberFormatException, IOException {
        System.out.println("please enter the ID of the client you want update");
        String clientId2 = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < application.getTheClients().size(); i++) {

            if (clientId2.equalsIgnoreCase(application.getTheClients().get(i).getClientId())) {

                System.out.println(
                        "please enter the information of the client you want to update \n\n (1) name \n (2) type ID \n (3) client ID \n (4) telephone \n (5) address");
                int opt = Integer.parseInt(br.readLine());

                switch (opt) {
                    case 1:
                        System.out.println("enter the new name");
                        String name = br.readLine();
                        application.getTheClients().get(i).setName(name);
                        System.out.println("the client information is update successfully");

                        break;

                    case 2:
                        System.out.println("enter the new type ID");
                        String typeId = br.readLine();
                        application.getTheClients().get(i).setTypeId(typeId);
                        System.out.println("the client information is update successfully");
                        break;

                    case 3:
                        System.out.println("enter the new client ID");
                        String clientId = br.readLine();
                        application.getTheClients().get(i).setClientId(clientId);
                        System.out.println("the client information is update successfully");
                        break;

                    case 4:
                        System.out.println("enter the new telephone");
                        String telephone = br.readLine();
                        application.getTheClients().get(i).setTelephone(telephone);
                        System.out.println("the client information is update successfully");
                        break;

                    case 5:
                        System.out.println("enter the new address");
                        String address = br.readLine();
                        application.getTheClients().get(i).setAddress(address);
                        System.out.println("the client information is update successfully");
                        break;

                }
            }

        }

    }

    public void updateInformationRestaurant() throws NumberFormatException, IOException {
        System.out.println("please enter the ID of the restaurant you want update");
        String id = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < application.getTheRestaurants().size(); i++) {

            if (id.equals(application.getTheRestaurants().get(i).getId())) {

                System.out.println(
                        "please enter the information of the restaurant you want to update \n\n (1) name \n (2) ID \n (3) name of administrator");
                int opt = Integer.parseInt(br.readLine());

                switch (opt) {
                    case 1:
                        System.out.println("enter the new name");
                        String name = br.readLine();
                        application.getTheRestaurants().get(i).setName(name);
                        System.out.println("the restaurant information is update successfully");

                        break;

                    case 2:
                        System.out.println("enter the new ID");
                        String newId = br.readLine();
                        application.getTheRestaurants().get(i).setId(newId);
                        System.out.println("the restaurant information is update successfully");
                        break;

                    case 3:
                        System.out.println("enter the new name of administrator");
                        String nameOfAdministrator = br.readLine();
                        application.getTheRestaurants().get(i).setNameOfAdministrator(nameOfAdministrator);

                        System.out.println("the restaurant information is update successfully");
                        break;
                }

            }

        }

    }

    public void updateInformationProduct() throws NumberFormatException, IOException {
        System.out.println("please enter the code of the product you want update");
        String code = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < application.getTheRestaurants().size(); i++) {

            for (int j = 0; j < application.getTheRestaurants().get(i).getTheProduct()
                    .size(); j++) {

                if ((code.equalsIgnoreCase(application.getTheRestaurants().get(i).getTheProduct().get(j).getCode()))) {
                    System.out.println(
                            "please enter the information of the product you want to update \n\n (1) code \n (2) name \n (3) description \n (4) coste \n (5) idOfRestaurant");
                    int opt = Integer.parseInt(br.readLine());

                    switch (opt) {
                        case 1:
                            System.out.println("enter the new code");
                            String newCode = br.readLine();
                            application.getTheRestaurants().get(i).getTheProduct().get(j).setCode(newCode);
                            System.out.println("the product information is update successfully");

                            break;

                        case 2:
                            System.out.println("enter the new name");
                            String name = br.readLine();
                            application.getTheRestaurants().get(i).getTheProduct().get(j).setName(name);
                            System.out.println("the product information is update successfully");
                            break;

                        case 3:
                            System.out.println("enter the new description");
                            String description = br.readLine();
                            application.getTheRestaurants().get(i).getTheProduct().get(j).setDescription(description);
                            System.out.println("the product information is update successfully");
                            break;

                        case 4:
                            System.out.println("enter the new coste");
                            double coste = Double.parseDouble(br.readLine());
                            application.getTheRestaurants().get(i).getTheProduct().get(j).setCoste(coste);
                            System.out.println("the product information is update successfully");
                            break;

                        case 5:
                            System.out.println("enter the new ID of restaurant");
                            String idOfRestaurant = br.readLine();
                            application.getTheRestaurants().get(i).getTheProduct().get(j).setIdOfRestaurant(idOfRestaurant);
                            System.out.println("the product information is update successfully");
                            break;

                    }

                }
            }


        }
    }

    public void updateInformationOrder() throws NumberFormatException, IOException {
        System.out.println("please enter the ID of the order you want update");
        String orderCode2 = br.readLine();
        System.out.println(" ");

        for (int i = 0; i < application.getTheOrders().size(); i++) {

            if (orderCode2.equals(application.getTheOrders().get(i).getOrderCode())) {

                System.out.println(
                        "please enter the information of the order you want to update \n\n (1) client ID \n (2) restaurant ID \n (3) order status");
                int opt = Integer.parseInt(br.readLine());

                switch (opt) {

                    case 1:
                        System.out.println("enter the new client ID");
                        String clientId = br.readLine();
                        application.getTheOrders().get(i).setClientId(clientId);
                        System.out.println("the order information is update successfully");
                        break;

                    case 2:
                        System.out.println("enter the new restaurant ID");
                        String restaurantId = br.readLine();
                        application.getTheOrders().get(i).setRestaurantId(restaurantId);
                        System.out.println("the client information is update successfully");
                        break;

                    case 3:
                        System.out.println("enter the new order status");
                        String orderStatus = br.readLine();


                        application.getTheOrders().get(i).setOrderStatus(orderStatus);
                        System.out.println("the order information is update successfully");
                        break;

                }
            }

        }

    }

}