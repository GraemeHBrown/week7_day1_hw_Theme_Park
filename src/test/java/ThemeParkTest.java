import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {

     ThemePark park;
     Ride dodgem;
     Ride coaster;
     ArrayList<Ride> rides;
     Customer adult1;


    @Before
    public void before(){
        rides = new ArrayList<>();
        dodgem = new Dodgem("Dodgem", 15.00, 12, 145);
        coaster = new Rollercoaster("Rollercoaster",20.00, 8, 90);
        rides.add(dodgem);
        rides.add(coaster);
        park = new ThemePark(rides);
        adult1 = new Adult(24, 175, 100.00);
        park.addCustomers(adult1);
    }

    @Test
    public void parkHasListOfRides(){
        assertEquals(2, park.getRides().size());
    }

    @Test
    public void parkHasListOfCustomers(){
        assertEquals(1, park.getCustomers().size());
    }

    @Test
    public void personAboveMinimumHeightCanRide(){
        assertTrue(park.checkCustomerHeightForRide(dodgem, adult1));
    }
}
