package za.co.markduggan.integer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/6/2016.
 */
public class IntMathsTest {

    IntMaths m1;

    @Before
    public void setUp() throws Exception {

        m1 = new IntMaths();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {

        assertTrue(m1.add(2,3) == 5);
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivZero() {
        m1.div(2,0);
    }


}