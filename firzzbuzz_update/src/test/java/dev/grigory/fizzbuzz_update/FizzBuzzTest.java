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
}
