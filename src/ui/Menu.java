package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Menu {
    Main main;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Register register;
    Update update;

    public Menu() throws NumberFormatException, IOException {
        register = new Register();
        update = new Update();
        pMenu();
    }

    public void pMenu() throws NumberFormatException, IOException {
        System.out.println(
                "Enter an option \n\n (1) Register client \n (2) Register product \n (3) Register order \n (4) Register restaurants \n (5) change Order status \n (6) Update \n (7) Save information \n (8) print \n (9) import \n (10) closed");
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
                register.updateOrderStatus();

                break;

            case 6:
                System.out.println(
                        "please enter the option \n\n (1) Update restaurant data \n (2) Update product data \n (3) update client data \n (4) update order data");
                int opt2 = Integer.parseInt(br.readLine());
                System.out.println(" ");
                switch (opt2) {
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