import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Dodgem",15.00F, 12, 145);
    }

    @Test
    public void dodgemHasType(){
        assertEquals("Dodgem", dodgem.getType());
    }

    @Test
    public void coasterHasPrice(){
        assertEquals(15.00, dodgem.getPrice(),00.00);
    }

    @Test
    public void dodgemHasMinAge(){
        assertEquals(12, dodgem.getMinimumAge());
    }

    @Test
    public void dodgemHasMinHeightRestriction(){
        assertEquals(145, dodgem.getMinimumHeight(),000);
    }

    @Test
    public void dodgemHasSpecificRideBehaviour(){
        assertEquals("Dodgem ride!", dodgem.ride());
    }
}
