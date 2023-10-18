package functionalinterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Using general methods
        int increment = incrementByOne(9);
        System.out.println(multiplyByTen(increment));

        //Using function
        System.out.println(incrementByOneAndMultiplyByTen.apply(9));
    }

    //Functions
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;
    static Function<Integer, Integer> incrementByOneAndMultiplyByTen =
            incrementByOneFunction.andThen(multiplyByTenFunction);

    //General methods
    static int incrementByOne(int number) {
        return number + 1;
    }
    static int multiplyByTen(int number) {
        return number * 10;
    }
}
