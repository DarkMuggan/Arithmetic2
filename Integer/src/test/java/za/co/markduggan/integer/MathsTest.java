package za.co.markduggan.integer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/5/2016.
 */
public class MathsTest {

    Maths m1;
    Maths m2;

    @Before
    public void setUp() throws Exception {

        m1 = new Maths();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {

        assertTrue(m1.add(2,3) == 5);
    }

    @Test
    public void testSame() throws Exception {

        m2 = m1;

        assertSame(m2,m1);


    }
}