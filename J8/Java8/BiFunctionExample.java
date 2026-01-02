package Java8;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.apply(10, 20));       // 30
        System.out.println("Multiplication: " + multiply.apply(5, 6)); // 30
    }
}

