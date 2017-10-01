package karlos.ReviewOOP.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DogTest {

    private Dog dog;

    @Before
    public void before() {
        dog = new Dog();

    }

    @Test
    public void testDog() {
        assertEquals("Bark", dog.getSound());
    }
}
