package karlos.ReviewOOP.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WorkWithAnimalsTest {

    private Animal animal;

    @Before
    public void before() {
        animal = new Animal();
        animal.setName("Chispas");
        animal.setSound("Ladra");
        animal.setHeight(15.0);
        animal.setSpeed(25.0);
        animal.setFavFood("Carne");
        animal.setSpeed(14.0);
    }


    @Test
    public void testSetName() {
        animal.setName("Linda");
        assertEquals("Linda", animal.getName());
    }

}
