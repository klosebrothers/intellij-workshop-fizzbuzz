package de.klosebrothers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void shouldReturnNumeral() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act
        String result = fizzBuzz.solve(1);

        //assert
        assertThat(result).isEqualTo("1");
    }

    @Test
    void shouldReturnFizzFor3() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act
        String result = fizzBuzz.solve(3);

        //assert
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnFizzFor6() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act
        String result = fizzBuzz.solve(6);

        //assert
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnBuzzFor5() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act
        String result = fizzBuzz.solve(5);

        //assert
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnBuzzFor10() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act
        String result = fizzBuzz.solve(5);

        //assert
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnFizzBuzzFor15() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act
        String result = fizzBuzz.solve(15);

        //assert
        assertThat(result).isEqualTo("FizzBuzz");
    }
}