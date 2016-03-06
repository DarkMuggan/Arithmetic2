package za.co.markduggan.booleans;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/6/2016.
 */
public class BooleansCheckTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testBoolTruth() throws Exception {
        assertTrue(BooleansCheck.boolTest(5,5));
    }
    @Test
    public void testBoolFalse() throws Exception {
        assertFalse(BooleansCheck.boolTest(6,5));
    }



    @Ignore @Test
    public void testIgnore() throws Exception {
        assertTrue(BooleansCheck.boolTest(6,5));
    }
}