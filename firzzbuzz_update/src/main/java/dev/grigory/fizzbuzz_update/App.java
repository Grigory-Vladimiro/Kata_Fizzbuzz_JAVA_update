package dev.grigory.fizzbuzz_update;

public final class App {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.evaluate(i));
        }
    }
}
