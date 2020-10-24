package exception;

@SuppressWarnings("serial")
public class DocNumberException extends Exception {

    public DocNumberException(String numDoc) {
        super("The document number can not enter.");
    }

}