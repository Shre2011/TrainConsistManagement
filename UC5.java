import java.util.LinkedHashSet;
import java.util.Set;

public class TrainAppUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC5) ===");

        // Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate insertion
        train.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("Final Train Formation: " + train);

        System.out.println("Program continues...");
    }
}
