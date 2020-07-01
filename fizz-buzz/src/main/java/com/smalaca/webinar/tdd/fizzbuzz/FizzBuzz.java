package com.smalaca.webinar.tdd.fizzbuzz;

class FizzBuzz {
    private static final String FIZZ = "Fizz";

    String convert(int number) {
        if (isDivisibleByThree(number)) {
            return FIZZ;
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
