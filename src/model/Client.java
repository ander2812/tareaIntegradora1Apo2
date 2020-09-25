package model;

public class Client implements Comparable<Client> {

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

    @Override
    public int compareTo(Client otherClient) {
        int comp;
        if(name.charAt(0) < otherClient.getName().charAt(0)){
            comp = 1;

        }else if(name.charAt(0) > otherClient.getName().charAt(0)){
            comp = -1;
        }else{
            comp = 0;
        }
        return comp;

     }  

     

}