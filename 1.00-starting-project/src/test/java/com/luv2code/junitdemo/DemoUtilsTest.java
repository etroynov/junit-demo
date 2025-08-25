package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Random.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;
    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    @DisplayName("Should return correct value")
    void testEqualsAndNotEquals() {
        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(8, demoUtils.add(2, 4), "2 + 4 is not 8");
    }

    @Test
    @DisplayName("Should return true")
    void testNullAndNotNull() {
        assertNull(demoUtils.checkNull(null), "Object should be null");
        assertNotNull(demoUtils.checkNull("My name is"), "Object should not be null");
    }

    @DisplayName("True or false")
    @Test
    void trueOrFalse () {
        assertTrue(demoUtils.isGreater(2, 1), "This should return true");
        assertFalse(demoUtils.isGreater(1, 2), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {
        String[] arr = {"A", "B", "C"};
        assertArrayEquals(demoUtils.getFirstThreeLettersOfAlphabet(), arr);
    }

    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals() {
        List<String> list = List.of("luv", "2", "code");

        assertIterableEquals(demoUtils.getAcademyInList(), list, "Lists should be Equals");
    }

    @DisplayName("Throw and does not throw")
    @Test
    void throwAndDoesNotThrow() {
        assertThrows(Exception.class, () -> { demoUtils.throwException(-1); }, "Should throw exception");
        assertDoesNotThrow(() -> { demoUtils.throwException(1); }, "Should not throw");
    }

    @DisplayName("Timeout")
    @Test
    void testTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> { demoUtils.checkTimeout(); }, "Method should execute in 3 sec");
    }
}
