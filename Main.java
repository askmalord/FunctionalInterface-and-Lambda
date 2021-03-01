package java_core_block.homeWork1.task_1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.calculatorObject.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(4, 3);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}
