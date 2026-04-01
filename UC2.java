import java.util.ArrayList;
import java.util.List;

public class TrainAppUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC2) ===");

        // Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition: " + bogies);

        // Remove a bogie (AC Chair)
        bogies.remove("AC Chair");

        // Check if Sleeper exists
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final state of bogies
        System.out.println("Final bogie list: " + bogies);

        System.out.println("Program continues...");
    }
}
