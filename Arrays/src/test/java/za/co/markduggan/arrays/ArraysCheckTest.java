package za.co.markduggan.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/6/2016.
 */
public class ArraysCheckTest {
    ArraysCheck dog1;
    ArraysCheck dog2;
    @Before
    public void setUp() throws Exception {
        dog1 = new ArraysCheck();
        dog2 = new ArraysCheck();
    }

    @Test
    public void testArrayGet() throws Exception {
        assertArrayEquals(dog1.arrayGet(),dog2.arrayGet());
    }
}