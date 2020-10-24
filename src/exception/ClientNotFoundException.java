package exception;

public class ClientNotFoundException extends Exception {
    public ClientNotFoundException(String name) {
        System.out.println("the client " + name + " was not found");
    }
}
