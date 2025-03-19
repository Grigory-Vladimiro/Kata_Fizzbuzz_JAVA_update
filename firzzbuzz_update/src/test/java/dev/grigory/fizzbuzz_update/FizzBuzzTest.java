package dev.grigory.fizzbuzz_update;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;
public class FizzBuzzTest {

    @Test
    void testBasicFizzBuzz() {
        Assertions.assertEquals("1", fizzBuzz.evaluate(1));
        Assertions.assertEquals("2", fizzBuzz.evaluate(2));
        Assertions.assertEquals("Fizz", fizzBuzz.evaluate(3));
        Assertions.assertEquals("Buzz", fizzBuzz.evaluate(5));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }

    @Test
    void testFizzBuzzWithContainingDigits() {
        Assertions.assertEquals("Fizz", fizzBuzz.evaluate(13));
        Assertions.assertEquals("Buzz", fizzBuzz.evaluate(52));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.evaluate(35));
    }

    @Test
    void testFizzBuzzListGeneration () {
        List<String> result = fizzBuzz.generate(1, 20);
        Assertions.assertEquals(20, result.size());
        Assertions.assertEquals("1", result.get(0));
        Assertions.assertEquals("Fizz", result.get(2));
        Assertions.assertEquals("Buzz", result.get(4));
        Assertions.assertEquals("FizzBuzz", result.get(14));
    }
}
