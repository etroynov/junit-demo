package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {
    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(8, demoUtils.add(2, 4), "2 + 4 is not 8");
    }

    @Test
    void testNullAndNotNull() {
        DemoUtils demoUtils = new DemoUtils();

        assertNull(demoUtils.checkNull(null), "Object should be null");
        assertNotNull(demoUtils.checkNull("My name is"), "Object should not be null");

    }
}
