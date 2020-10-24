package exception;

public class TypeDocumentException extends Exception {

    private final String typeId;

    public TypeDocumentException(String typeId ){

        super("The type document number can not enter. ");
        this.typeId =typeId;

    }

    public String getTypeId() {
        return typeId;
    }

}