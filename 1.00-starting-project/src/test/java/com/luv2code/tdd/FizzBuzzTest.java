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
}
