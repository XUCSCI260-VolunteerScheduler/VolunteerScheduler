package io.github.xucsci260volunteerscheduler.Services.Interfaces;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ServiceExampleTest {

    @Test
    public void testAddition() {
        int x = 10, y = 10, realSum = 20;

        int testSum = x+y;

        assertEquals(realSum, testSum);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void throwException() {
        int[] array = new int[2];
        array[2] = 10; // should be out of bounds
    }
}
