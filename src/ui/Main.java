package ui;

import exception.ClientNotFoundException;

import java.io.IOException;

public class Main {
    Menu menu;

    public Main() throws NumberFormatException, IOException, ClientNotFoundException {
        welcomeMsg();
        new Menu();

    }
    public static void main(String[] args) throws NumberFormatException, IOException, ClientNotFoundException {
        new Main();



    }

    public void welcomeMsg() {
        System.out.println("\n Welcome to your plataform of order\n");
        System.out.println("=======================================");
        System.out.println("==================APLIORD==============");
        System.out.println("=======================================\n\n");

    }





}

