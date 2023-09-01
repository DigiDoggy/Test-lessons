package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    //If number is divisible by 3, print Fizz
    //If number is divisible by 5, print Buzz
    //If number is divisible by 3 and 5, print FizzBuzz
    //If number is NOT divisible by 3 and 5, then print the number

    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testOrDivisibleByThree(){
        String expected = "Fizz";
        assertEquals(expected,FizzBuzz.compute(3), "Should return Fizz");
    }
    //If number is divisible by 5, print Buzz
    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testOrDivisibleByFive(){
        String expected ="Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

}
