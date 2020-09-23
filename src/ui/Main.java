package ui;
import model.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Main{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Restaurant myRestaurant;
    Menu menu;

    public Main() throws NumberFormatException, IOException {
        welcomeMsg();
        new Menu();

    }
    public static void main(String args[]) throws NumberFormatException, IOException {
        new Main();

        

    }

    public void welcomeMsg() {
        System.out.println("\n Welcome to your plataform of order\n");
        System.out.println("=======================================");
        System.out.println("==================APLIORD==============");
        System.out.println("=======================================\n\n");

    }

   

    

}