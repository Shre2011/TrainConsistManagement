import java.util.*;

public class TrainExceptionApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 60));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("First Class", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            b.display();
        }
    }
}
