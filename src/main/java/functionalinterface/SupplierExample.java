package functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    //Method
    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    //Supplier returns some value
    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
}
