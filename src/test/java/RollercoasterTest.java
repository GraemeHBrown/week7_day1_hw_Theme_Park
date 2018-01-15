import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster coaster;

    @Before
    public void before(){
        coaster = new Rollercoaster("Rollercoaster",20.00, 8, 90);
    }

    @Test
    public void coasterHasType(){
        assertEquals("Rollercoaster", coaster.getType());
    }

    @Test
    public void coasterHasPrice(){
        assertEquals(20.00, coaster.getPrice(),00.00);
    }

    @Test
    public void coasterHasMinAge(){
        assertEquals(8, coaster.getMinimumAge());
    }

    @Test
    public void coasterHasMinHeightRestriction(){
        assertEquals(90, coaster.getMinimumHeight(),000);
    }

    @Test
    public void coasterHasSpecificRideBehaviour(){
        assertEquals("Coaster ride!", coaster.ride());
    }


}
