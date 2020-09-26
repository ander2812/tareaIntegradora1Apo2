package model;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order {

    public String orderCode;
    public Date date;
    public String clientId;
    public String restaurantId;
    public final static String ENTREGADO="entregado";
    public final static String EN_PROCESO="en proceso";
    public final static String ENVIADO="enviado";
    private List<Product> productsAdd;

    public String orderStatus;

    public Order(String orderCode, String orderStatus, Date date, String clientId, String restaurantId) {
        this.orderCode = orderCode;
        this.date = date;
        this.clientId = clientId;
        this.restaurantId = restaurantId;
        this.orderStatus = orderStatus;
        date = new Date();
        productsAdd = new ArrayList<>();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void addProduct(Product product){
        productsAdd.add(product);

    }

    public List<Product> getProductsAdd() {
        return productsAdd;
    }

    public void setProductsAdd(List<Product> productsAdd) {
        this.productsAdd = productsAdd;
    }
    
}