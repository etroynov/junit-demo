package com.luv2code.tdd;

public class FizzBuzz {
    public static String compute(int num) {
        StringBuilder result = new StringBuilder();

        if (num % 3 == 0) {
            result.append("Fizz");
        }

        if (num % 5 == 0) {
            result.append("Buzz");
        }

        if (result.isEmpty()) {
            result.append(num);
        }

        return result.toString();
    }
}
