package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import model.*;

public class Menu {
    Main main;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Register register;
    Update update;
    App application;

    public Menu() throws NumberFormatException, IOException {
        application = new App();
        register = new Register(application);
        update = new Update(application);
        pMenu();
    }

    public void pMenu() throws NumberFormatException, IOException {
        System.out.println(
                "Enter an option \n\n (1) Register client \n (2) Register product \n (3) Register order \n (4) Register restaurants \n (5) Update \n (6) Save information \n (7) print \n (8) import \n (9) closed");
        int opt = Integer.parseInt(br.readLine());

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
                System.out.println("please enter the option \n\n (1) Update restaurant data \n (2) Update product data \n (3) update client data \n (4) update order data \n (5) back to main menu");
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

            case 7:
                break;

            case 8:
                break;

            case 9:
                break;

            case 10:
                break;

            case 11:
                break;
        }

    }

}