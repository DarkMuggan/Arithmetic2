package za.co.markduggan.main;

import za.ca.markduggan.objects.ObjectsCheck;
import za.co.markduggan.arrays.ArraysCheck;
import za.co.markduggan.booleans.BooleansCheck;
import za.co.markduggan.floatingpoint.FloatMaths;
import za.co.markduggan.integer.IntMaths;

/**
 * Created by Bloodmonk on 3/6/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        //Demonstrate all modules available for use.

        IntMaths maths = new IntMaths();
        ArraysCheck arrays = new ArraysCheck();
        BooleansCheck bools = new BooleansCheck();
        FloatMaths floats = new FloatMaths();
        ObjectsCheck objects = new ObjectsCheck();
    }


}