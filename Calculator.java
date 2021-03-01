package java_core_block.homeWork1.task_1;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> calculatorObject = Calculator::new;
    BinaryOperator<Integer> plus = (a, b) -> a + b;
    BinaryOperator<Integer> minus = (a, b) -> a - b;
    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    BinaryOperator<Integer> divide = (a, b) -> {
        if (b != 0) {
            return a / b;
        }
        else {
            throw new NullPointerException("На ноль делить нельзя");
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
