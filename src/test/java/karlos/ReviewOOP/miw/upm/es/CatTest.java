package karlos.ReviewOOP.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CatTest {

    private Cat cat;

    @Before
    public void before() {
        cat = new Cat();

    }

    @Test
    public void testCat() {
        assertEquals("Ladra", cat.getSound());
    }

}
