package com.smalaca.webinar.tdd.fizzbuzz;

class FizzBuzz {
    String convert(int number) {
        if (isDivisibleByThree(number)) {
            return "Fizz";
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
