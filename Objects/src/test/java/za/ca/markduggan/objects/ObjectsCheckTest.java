package za.ca.markduggan.objects;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/6/2016.
 */
public class ObjectsCheckTest {
    ObjectsCheck temp;
    ObjectsCheck nuller;

    @Before
    public void setUp() throws Exception {

        temp = ObjectsCheck.obFactory();
    }

    @Test
    public void testIdentity() throws Exception {

       assert temp instanceof ObjectsCheck;
    }

    @Test
    public void testDifferent() throws Exception {
        ObjectsCheck ob1 = ObjectsCheck.obFactory();
        ObjectsCheck ob2 = ObjectsCheck.obFactory();

        assertNotSame(ob1,ob2);
    }
    @Test
    public void testNull() throws Exception
    {
        assertNull(nuller);
    }
    @Test
    public void testNotNull() throws Exception
    {
        assertNotNull(temp);
    }
    @Test(timeout = 100)
    public void testTimeouts() throws Exception
    {
        for(int i =0;i <999999;i++)
        {
            temp = ObjectsCheck.obFactory();
        }
    }


}