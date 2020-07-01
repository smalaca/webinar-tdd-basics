package com.smalaca.webinar.tdd.fizzbuzz;

class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    String convert(int number) {
        if (isDivisibleBy(number, 3)) {
            return FIZZ;
        }

        if (isDivisibleBy(number, 5)) {
            return BUZZ;
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
