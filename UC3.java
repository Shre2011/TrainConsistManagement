import java.util.HashSet;
import java.util.Set;

public class TrainAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC3) ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");

        // Attempt to add duplicate
        bogieIds.add("B102"); // duplicate → ignored automatically

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);

        System.out.println("Program continues...");
    }
}
