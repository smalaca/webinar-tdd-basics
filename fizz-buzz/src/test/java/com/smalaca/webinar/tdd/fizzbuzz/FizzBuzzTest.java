package com.smalaca.webinar.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();
    /*
      REQUIREMENTS:
      1. Return number as string when get number.
      2. Return Fizz when get number divisible by 3.
      3. Return Buzz when get number divisible by 5.
      3. Return FizzBuzz when get number divisible by 15.
     */

    @Test
    void shouldReturnOneAsStringWhenOneGiven() {
        String actual = fizzBuzz.convert(1);

        assertThat(actual).isEqualTo("1");
    }

    @Test
    void shouldReturnTwoAsStringWhenTwoGiven() {
        String actual = fizzBuzz.convert(2);

        assertThat(actual).isEqualTo("2");
    }

    @Test
    void shouldReturnFizzWhenThreeGiven() {
        String actual = fizzBuzz.convert(3);

        assertThat(actual).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnBuzzWhenFiveGiven() {
        String actual = fizzBuzz.convert(5);

        assertThat(actual).isEqualTo("Buzz");
    }
}
