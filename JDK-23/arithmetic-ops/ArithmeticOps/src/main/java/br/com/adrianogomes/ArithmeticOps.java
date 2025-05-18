package br.com.adrianogomes;

import java.util.Map;
import java.util.function.BiFunction;

public class ArithmeticOps {

    private static final Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = Map.of(
            "+", Integer::sum,
            "-", (a, b) -> a - b,
            "*", (a, b) -> a * b,
            "/", (a, b) -> a / b,
            "%", (a, b) -> a % b
    );

    public static int operate(int num1, int num2, String operator) {
        BiFunction<Integer, Integer, Integer> operation = OPERATIONS.get(operator);

        if (operation == null) {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        return operation.apply(num1, num2);
    }
}
