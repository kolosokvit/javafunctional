package functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply(4,10) + " - using method");
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 10) + " - using BiFunction");
    }

    //Method
    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }

    //BiFunction takes 2 arguments and produces 1 result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
