package model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class ClientTest {
    private Client client;
    private App application;

    private void setupScenary1() {
        application = new App();
    }

    @Test
    public void testClient1() {
        setupScenary1();
        assertNotNull(application.getTheClients().get(0).getClientId());
        assertNotNull(application.getTheClients().get(0).getName());

    }

    private void setupScenary2(){
        application = new App();
    }

    @Test
    public void testClient() {
        setupScenary2();
        String clientName = "Andrea";
        String idType = "CE";
        String numberId = "5757578";
        String telephone = "2345678";
        String address = "asdfgh";
        client = new Client(clientName, idType, numberId, telephone, address);
        assertEquals(numberId, application.getTheClients().get(1).getClientId(), application.getTheClients().get(1).getClientId());

    }



}