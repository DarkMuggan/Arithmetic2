package za.co.markduggan.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/6/2016.
 */
public class MainClassTest {

    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void testFailer() throws Exception {
        //purposefully fail test
        fail("This failed on purpose!");
    }
}