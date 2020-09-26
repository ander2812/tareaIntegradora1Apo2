package model;
import org.junit.Test;
import org.junit.Before;    
import exception.DocNumberException;
import exception.TypeDocumentException;

    
public class AppTest {
    private App application;

    public void setupScenary1() {
		
		application = new App();
	}
        
    @Test
    public void testaddClient_1() {
            setupScenary1();
            String typeId= "cc";
            String clientId= "123456";

            application.addClient(typeDocument, docNumber);
			
			assertEquals(1,application.getClient().size());
            assertEquals(clientId,application.getClient().get(0).getClientId());

            assertEquals(1,miniMarket.getClient().size());
			assertEquals(typeDocument,miniMarket.getClient().get(0).getTypeId());
            


        
    }
}
    