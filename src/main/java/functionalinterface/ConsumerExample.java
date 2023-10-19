package functionalinterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        greetCustomer(new Customer("Tedd", "+375335554411"));
        greetingConsumer.accept(new Customer("Jack", "+375337774411"));
    }

    //Method
    static void greetCustomer(Customer customer) {
        System.out.println("Hello, " + customer.customerName +
                ". Thanks for registering phone number: " + customer.customerPhoneNumber);
    }

    //Consumer accepts 1 argument and returns nothing
    static Consumer<Customer> greetingConsumer = customer ->
            System.out.println("Hello, " + customer.customerName +
                    ". Thanks for registering phone number: " + customer.customerPhoneNumber);

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
