package optionals;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("john@gmail.com");
        //If optional is present print "Sending email to " + email, if optional equals null print "Cannot send email"
        stringOptional.ifPresentOrElse(email -> System.out.println("Sending email to " + email), () -> {System.out.println("Cannot send email");
        });

        //Handle NullPointerException with Optional
        List<Client> clients = List.of(new Client("Dave", "dave@gmail.com"), new Client("Anna", null));
        clients.forEach(client -> System.out.println(client.getEmail().orElse("email is not provided")));
    }
}

class Client {
    final String name;
    final String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    //Getter returns Optional for handling null value
    public Optional <String> getEmail() {
        return Optional.ofNullable(email);
    }
}
