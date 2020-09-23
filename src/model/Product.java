package model;
public class Product{

    public String code;
    public String name;
    public String description;
    public double coste;
    public String idOfRestaurant;
    public int quantity;

    public Product(String code, String name, String description, double coste, String idOfRestaurant, int quantity) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.coste = coste;
        this.idOfRestaurant = idOfRestaurant;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public String getIdOfRestaurant() {
        return idOfRestaurant;
    }

    public void setIdOfRestaurant(String idOfRestaurant) {
        this.idOfRestaurant = idOfRestaurant;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}