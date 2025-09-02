package com.luv2code.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    // If number divisible by 3, print Fizz
    // If number divisible by 5, print Buzz
    // If number NOT divisible by 3 and 5, print number

    @Test
    void testForDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.compute(3), "should return Fizz");
    }

    @Test
    void testForDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.compute(5), "should return Buzz");
    }

    @Test
    void testForDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.compute(15), "should return FizzBuzz");
    }

    @Test
    void testForNotDivisibleByThreeAndFive() {
        assertEquals("11", FizzBuzz.compute(11), "should return 11");
    }

    @Test
    void testLoopOverArray() {
        String[][] cases = {
            {"1", "1"},
            {"2", "2"},
            {"3", "Fizz"},
            {"4", "4"},
            {"5", "Buzz"},
            {"15", "FizzBuzz"}
        };

        for (String[] el: cases) {
            assertEquals(el[1], FizzBuzz.compute(Integer.parseInt(el[0])));
        }
    }
}
