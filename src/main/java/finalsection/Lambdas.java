package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //One line lambda expression
        Function<String, String> upperCaseName = name -> name.toUpperCase();
        System.out.println(upperCaseName.apply("Alice"));

        //Lambda expression with additional logic
        Function<String, String> lowerCaseName = name -> {
            if (name.isBlank()) {
                throw new IllegalArgumentException("name is blank");
            } else {
                return name.toLowerCase();
            }
        };
        System.out.println(lowerCaseName.apply("Alice"));

        //Lambda with two arguments
        BiFunction<Integer, Integer, String> sum = (arg1, arg2) -> String.valueOf(arg1 + arg2);
        System.out.println(sum.apply(2, 3));
    }

}
