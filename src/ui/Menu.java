package ui;
import exception.ClientNotFoundException;
import model.App;

import java.io.*;

public class Menu {
    Main main;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Register register;
    Update update;
    App application;
    Serializable Serealizable;

    public Menu() throws NumberFormatException, IOException, ClientNotFoundException {
        application = new App();
        register = new Register(application);
        update = new Update(application);
        Serealizable = new Serializable(application);
        pMenu();
    }

    public void pMenu() throws NumberFormatException, IOException, ClientNotFoundException {

        int opt;

        do {

            System.out.println(
                    "Enter an option \n\n (1) Register client \n (2) Register product \n (3) Register order \n (4) Register restaurants \n (5) Update \n (6) Export restaurant information \n (7) export product information \n (8) search client  \n (9) to list \n (10) closed");
            opt = Integer.parseInt(br.readLine());

            switch (opt) {
                case 1:
                    register.regClient();

                    break;

                case 2:
                    register.registerProduct();
                    break;

                case 3:
                    register.regOrder();
                    break;

                case 4:
                    register.registerRestaurant();

                    break;

                case 5:
                    System.out.println(
                            "please enter the option \n\n (1) Update restaurant data \n (2) Update product data \n (3) update client data \n (4) update order data \n (5) back to main menu");
                    opt = Integer.parseInt(br.readLine());
                    System.out.println(" ");
                    switch (opt) {
                        case 1:
                            update.updateInformationRestaurant();

                            break;

                        case 2:
                            update.updateInformationProduct();

                            break;

                        case 3:
                            update.updateInformationClient();

                            break;

                        case 4:
                            update.updateInformationOrder();

                            break;
                    }

                    break;

                case 6:
                    Serealizable.restaurantsCSV();
                    break;

                case 7:
                    Serealizable.productsCSV();
                    break;

                case 8:
                    register.searchClient();
                    break;

                case 9:
                    System.out.println(
                            "please enter the information you want to list \n\n (1) Restaurant \n (2) Client \n (3) Product");
                    opt = Integer.parseInt(br.readLine());

                    switch (opt) {
                        case 1:
                            register.restaurantList();

                            break;

                        case 2:
                            register.clientList();
                            break;

                        case 3:
                            register.productList();
                            break;

                        case 4:
                            register.orderList();
                            break;
                    }
                    break;

                case 10:
                    System.out.println("-------------thanks for using our services----------------");
                    break;
            }

        } while (opt != 10);

    }
}
