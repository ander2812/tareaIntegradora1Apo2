package model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class Client{
    private List<Order>theOrders;

    private String typeId;
    private String clientId;
    private String telephone;
    private String address;
    private String name;

    public Client(String name, String typeId, String clientId, String telephone, String address) {
        this.typeId = typeId;
        this.clientId = clientId;
        this.telephone = telephone;
        this.address = address;
        this.name = name;
        theOrders = new ArrayList<>();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(String orderCode, String orderStatus, Date date, String clientId,String restaurantId){
        Order order = new Order(orderCode, orderStatus, date, clientId, restaurantId);
        theOrders.add(order);



    }

    public List<Order> getTheOrders() {
        return theOrders;
    }

    public void setTheOrders(List<Order> theOrders) {
        this.theOrders = theOrders;
    }
    
}