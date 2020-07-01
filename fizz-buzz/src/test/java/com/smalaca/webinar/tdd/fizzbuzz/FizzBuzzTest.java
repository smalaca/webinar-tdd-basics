package com.smalaca.webinar.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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
    @ParameterizedTest
    @MethodSource("numberAsString")
    void shouldReturnNumberAsString(int number, String expected) {
        String actual = fizzBuzz.convert(number);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> numberAsString() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(11, "11"),
                Arguments.of(13, "13"),
                Arguments.of(41, "41")
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 21})
    void shouldReturnFizzWhenNumberDivisibleByThreeGiven(int number) {
        String actual = fizzBuzz.convert(number);

        assertThat(actual).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 100})
    void shouldReturnBuzzWhenNumberDivisibleByFiveGiven(int number) {
        String actual = fizzBuzz.convert(number);

        assertThat(actual).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 150, 315})
    void shouldReturnFizzBuzzWhenNumberDivisibleByFifteenGiven(int number) {
        String actual = fizzBuzz.convert(number);

        assertThat(actual).isEqualTo("FizzBuzz");
    }
}
