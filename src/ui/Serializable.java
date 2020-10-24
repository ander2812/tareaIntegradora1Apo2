package ui;

import model.App;
import model.Product;
import model.Restaurant;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializable {
    App application;

    public Serializable(App application) {
        this.application = application;

    }

    public void restaurantsCSV() {
        Path filePath = Paths.get("./doc/restaurants.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            int count = 0;
            while ((linea = br.readLine()) != null) {
                if (count != 0) {
                    String[] LineDate = linea.split(",");
                    String name = LineDate[0];
                    String id = LineDate[1];
                    String nameOfAdministrator = LineDate[2];

                    Restaurant theNewRestaurant = new Restaurant(name, id, nameOfAdministrator);
                    application.addRestaurant(theNewRestaurant);
                }
                count++;
            }

        } catch (Exception a) {
            a.getMessage();
        }
    }

    public void productsCSV() {
        Path filePath = Paths.get("./doc/products.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if (count != 0) {
                    for (int j = 0; j < application.getTheRestaurants().size(); j++) {
                        for (int j2 = 0; j2 < application.getTheRestaurants().get(j).getTheProduct().size(); j2++) {

                            String[] Line = line.split(",");
                            String code = Line[0];
                            String name = Line[1];
                            String description = Line[2];
                            String idOfRestaurant = Line[3];
                            int quantity = Integer.parseInt(Line[4]);
                            double coste = Double.parseDouble(Line[5].trim());
                            Product product = new Product(code, name, description, coste, idOfRestaurant, quantity);
                            application.getTheRestaurants().get(j).addProduct(product);

                        }

                    }

                }
                count++;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

}