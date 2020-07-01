package com.smalaca.webinar.tdd.fizzbuzz;

class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    String convert(int number) {
        String converted = "";

        if (isDivisibleBy(number, 3)) {
            converted += FIZZ;
        }

        if (isDivisibleBy(number, 5)) {
            converted += BUZZ;
        }

        return converted.isEmpty() ? String.valueOf(number) : converted;
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
