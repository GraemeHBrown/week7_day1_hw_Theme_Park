import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildTest {

    Child child1;

    @Before
    public void before(){
         child1 = new Child(8, 90, 12.00);
    }

    @Test
    public void childHasAge(){
        assertEquals(8, child1.getAge());
    }

    @Test
    public void childHasHeight(){
        assertEquals(90, child1.getHeight());
    }

    @Test
    public void childHasMoney(){
        assertEquals(12.00, child1.getMoney(),00.00);
    }
}
