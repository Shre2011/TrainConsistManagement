import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        // Step 2: Convert to stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // Extract capacity
                .reduce(0, Integer::sum);      // Sum all values

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}
