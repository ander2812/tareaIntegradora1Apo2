package model;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class AppTest {
    private App application;
    private Restaurant restaurant;

    public void setupScenary1() {

        application = new App();
    }

    @Test
    public void testAddClient_1() {
        setupScenary1();
        String typeId= "cc";
        String id= "454667";
        String name= "Paola";
        String telephone="3457890";
        String address="pao.uyh@gmail.com";

        application.addClient(name, typeId, id, telephone, address);

        assertEquals(5,application.getTheClients().size());
        assertEquals(id,application.getTheClients().get(0).getClientId());

        assertEquals(5,application.getTheClients().size());
        assertEquals(typeId,application.getTheClients().get(0).getTypeId());


    }

    private void setupScenary2(){
        application = new App();

    }

    @Test
    public void testAddRestaurant() {
        setupScenary2();
        String name = "waffles";
        String nit = "345678";
        String nameAdministration = "Andrea";
        restaurant = new Restaurant(name,nit,nameAdministration);
        application.addRestaurant(restaurant);
        assertNotNull(application.getTheRestaurants());
        assertEquals(name, restaurant.getName());
        assertEquals(nit, restaurant.getId());
        assertEquals(nameAdministration,restaurant.getNameOfAdministrator());

    }


}