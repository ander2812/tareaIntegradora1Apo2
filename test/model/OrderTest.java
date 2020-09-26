package model;
import org.junit.Test;
import org.junit.Before;    
    
public class OrderTest {
            
        @Test
        public void testaddProduct_1() {
                setupScenary1();
                String code= "12345678";
                String name= "crepes de queso";
                String description="crepes cubierto de queso ";
                double coste=8000;
    
                application.addProduct(code, name, description, coste);
                
                assertEquals(1,application.getTheRestaurat().get(0).size());
                assertEquals(clientId,application.getRestaurant.get(0).getTheProduct().get(0).getCode());
    
                assertEquals(1,application.getTheRestaurat().get(0).size());
                assertEquals(clientId,application.getRestaurant.get(0).getTheProduct().get(0).getName());

                assertEquals(1,application.getTheRestaurat().get(0).size());
                assertEquals(clientId,application.getRestaurant.get(0).getTheProduct().get(0).getDescription());
                
    
    
            
        }
        
    }
}
    