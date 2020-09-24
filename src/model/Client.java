package model;
import java.util.ArrayList;
import java.util.List;
public class Client{

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
    
}