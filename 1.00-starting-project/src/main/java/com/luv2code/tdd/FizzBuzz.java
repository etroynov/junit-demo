package com.luv2code.tdd;

public class FizzBuzz {
    public static String compute(int num) {
        if (num % 5 == 0 && num % 3 == 0) {
            return "FizzBuzz";
        }

        if (num % 3 == 0) {
            return "Fizz";
        }

        if (num % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(num);
    }
}
