package model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    private Order order;
    private App application;
    private void setupScenary1(){
        application = new App();
    }

    @Test
    public void testOrder() {
        setupScenary1();

        String orderCode = "12352221";
        String codeProduct = "3056";
        int quantity = 23000;
        Date date = new Date();
        String clientId = "5757578";
        String restaurantId = "123456";
        String orderStatus = "Sent";
        order = new Order(orderCode, orderStatus, date, clientId, restaurantId);
        assertEquals(restaurantId, application.getTheRestaurants().get(1).getId(), "se encontro");
        assertEquals(clientId, application.getTheClients().get(1).getClientId(), "se encontro");

    }

}