package com.smalaca.webinar.tdd.fizzbuzz;

class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    String convert(int number) {
        if (isDivisibleByThree(number)) {
            return FIZZ;
        }

        if (number % 5 == 0) {
            return BUZZ;
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
