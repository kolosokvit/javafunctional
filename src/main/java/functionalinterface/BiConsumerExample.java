package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        greetingConsumer.accept(new Customer("Anna", "+375331111111"), true);
        greetingConsumer.accept(new Customer("Kate", "+375332222222"), false);
    }

    //BiConsumer accepts 2 arguments and returns nothing
    static BiConsumer<Customer, Boolean> greetingConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello, " + customer.customerName +
                    ". Thanks for registering phone number: "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*************"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
