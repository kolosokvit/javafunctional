package functionalinterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        int increment = incrementByOne(9);
        System.out.println(multiplyByTen(increment) + " - using method.");
        System.out.println(incrementByOneAndMultiplyByTen.apply(9) + " - using Function.");
    }

    //Methods
    static int incrementByOne(int number) {
        return number + 1;
    }
    static int multiplyByTen(int number) {
        return number * 10;
    }

    //Functions take 1 argument and produce 1 result
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    //Chaining functions
    static Function<Integer, Integer> incrementByOneAndMultiplyByTen =
            incrementByOneFunction.andThen(multiplyByTenFunction);
}
