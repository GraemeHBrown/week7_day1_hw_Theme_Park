import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdultTest {

    Adult adult1;

    @Before
    public void before(){
        adult1 = new Adult(24,175,100.00);
    }

    @Test
    public void adultHasAge(){
        assertEquals(24, adult1.getAge());
    }

    @Test
    public void adultHasHeight(){
        assertEquals(175, adult1.getHeight());
    }

    @Test
    public void adultHasMoney(){
        assertEquals(100.00, adult1.getMoney(),000.00);
    }



}
