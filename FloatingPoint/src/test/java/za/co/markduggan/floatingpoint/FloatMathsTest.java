package za.co.markduggan.floatingpoint;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/6/2016.
 */
public class FloatMathsTest {
    FloatMaths f;
    @Before
    public void setUp() throws Exception {
        f = new FloatMaths();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {
        assert 10f == f.multiply(2,5);
    }
}