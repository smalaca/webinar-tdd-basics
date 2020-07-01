package com.smalaca.webinar.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    /*
      REQUIREMENTS:
      1. Return number as string when get number.
      2. Return Fizz when get number divisible by 3.
      3. Return Buzz when get number divisible by 5.
      3. Return FizzBuzz when get number divisible by 15.
     */

    @Test
    void shouldReturnOneAsStringWhenOneGiven() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.convert(1);

        assertThat(actual).isEqualTo("1");
    }

    @Test
    void shouldReturnTwoAsStringWhenTwoGiven() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.convert(2);

        assertThat(actual).isEqualTo("2");
    }
}
