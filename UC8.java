import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse UC7 data)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        // Step 2: Convert list to stream and filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // Condition
                .collect(Collectors.toList()); // Collect result

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            b.display();
        }
    }
}
