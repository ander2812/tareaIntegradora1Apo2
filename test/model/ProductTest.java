package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    private Restaurant restaurant;
    private Product product;
    private App application;
    private void setupScenary1(){
        String name = "waffles";
        String id = "12345678";
        String nameOfAdministrator = "Andrea";

      restaurant = new Restaurant( name, id, nameOfAdministrator);
    }
    private void setupScenary2(){
        String name = "waffles";
        String id = "12345678";
        String nameOfAdministrator = "Andrea";

        restaurant = new Restaurant( name, id, nameOfAdministrator);

    }
    @Test
    public void testProduct() {
        setupScenary1();
        assertNotNull(restaurant.getTheProduct());

    }

    @Test
    public void testAddProduct() {
        setupScenary2();
        String code = "234567";
        String productName = "waffles";
        String productDescription = "waffles con chocolate";
        String restaurantNit = "123456";
        double coste = 250000;
        int productQuantity = 2;
        product = new Product(code,productName,productDescription,coste, restaurantNit,productQuantity);
        application.addProductToARestaurant(restaurantNit,product);
        assertNotNull(restaurant.getTheProduct());
        assertEquals(code, product.getCode());
        assertEquals(productName, product.getName());
        assertEquals(coste,product.getCoste());
    }
}
