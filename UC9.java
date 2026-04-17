import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse UC7/UC8)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        // Step 2: Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.getType()));

        // Step 3: Display grouped bogies
        System.out.println("Grouped Bogies:");

        for (String type : groupedBogies.keySet()) {
            System.out.println("\nCategory: " + type);

            for (Bogie b : groupedBogies.get(type)) {
                b.display();
            }
        }
    }
}
