package functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //Using methods
        System.out.println(isPhoneNumberValid("+375299998822"));
        System.out.println(isPhoneNumberValid("375299998822"));

        //using predicates
        System.out.println(isPhoneNumberValidPredicate.test("+365331112233"));

        //Combining predicates
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+375331116677"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+375") && phoneNumber.length() == 13;
    }

    //Predicate takes 1 argument and returns boolean value
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+375") && phoneNumber.length() == 13;
    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
