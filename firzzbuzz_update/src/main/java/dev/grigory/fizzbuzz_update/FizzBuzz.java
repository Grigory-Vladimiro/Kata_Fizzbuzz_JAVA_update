package dev.grigory.fizzbuzz_update;

import java.util.List;
import java.util.ArrayList;
public class FizzBuzz {

        public String evaluate(int number) {
            boolean isFizz = number % 3 == 0 || String.valueOf(number).contains("3");
            boolean isBuzz = number % 5 == 0 || String.valueOf(number).contains("5");
            if (isFizz && isBuzz) return "FizzBuzz";
            if (isFizz) return "Fizz";
            if (isBuzz) return "Buzz";
            return String.valueOf(number);
        }

        public List<String> generate(int start, int end) {
            List<String> result = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                result.add(evaluate(i));
            }
            return result;
        }
}
