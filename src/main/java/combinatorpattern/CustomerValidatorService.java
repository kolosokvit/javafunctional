package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    public boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+375");
    }

    public boolean isAdult(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears() >= 18;
    }

    public boolean isCustomerValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDateOfBirth());
    }
}
