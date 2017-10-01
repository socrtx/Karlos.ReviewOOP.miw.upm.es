package karlos.ReviewOOP.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

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

    @Test
    public void testGetName() {
        assertEquals("Chispas", animal.getName());
    }

    @Test
    public void testSetHeight() {
        animal.setHeight(100.0);
        assertEquals(100.0, animal.getHeight(), 1e-15);
     }

    @Test
    public void testGetHeight() {
        assertEquals(15.0, animal.getHeight(), 1e-15);
    }

    @Test
    public void testSetWeight() {
        animal.setHeight(25.0);
        assertEquals(25.0, animal.getHeight(), 1e-15);
    }

    @Test
    public void testGetWeight() {
        assertEquals(15.0, animal.getHeight(), 1e-15);
    }

    @Test
    public void testSetFavFood() {
        animal.setFavFood("Huesos");
        assertEquals("Huesos", animal.getFavFood());
    }

    @Test
    public void testGetFavFood() {
        assertEquals("Carne", animal.getFavFood());
    }

    @Test
    public void testSetSpeed() {
        animal.setSpeed(10.0);
        assertEquals(10.0, animal.getSpeed(), 1e-15);
    }

    @Test
    public void testGetSpeed() {
        assertEquals(14.0, animal.getSpeed(), 1e-15);
    }

    @Test
    public void testSetSound() {
        animal.setSound("Ladridos");
        assertEquals("Ladridos", animal.getSound());
    }

    @Test
    public void testGetSound() {
        assertEquals("Ladra", animal.getSound());
    }

}
