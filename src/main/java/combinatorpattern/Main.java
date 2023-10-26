package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@gmail.com", "+375251112233", LocalDate.of(2000, 1, 1));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isCustomerValid(customer));

        //Using combinator pattern
        ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isAdult()).apply(customer);
        System.out.println(result);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalArgumentException(result.name());
        }
    }
}
