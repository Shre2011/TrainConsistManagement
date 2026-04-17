import java.util.*;

public class TrainSafetyApp {

    public static void main(String[] args) {

        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        goodsList.add(new GoodsBogie("Cylindrical", "Coal"));      // invalid
        goodsList.add(new GoodsBogie("Rectangular", "Coal"));      // valid
        goodsList.add(new GoodsBogie("Rectangular", "Steel"));     // valid

        // Step 1: Define safety rule using lambda
        SafetyRule rule = (b) -> {
            if (b.getType().equalsIgnoreCase("Cylindrical")) {
                return b.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // Rectangular is flexible for solids
        };

        // Step 2: Apply rule using stream
        System.out.println("Safety Compliance Check:\n");

        goodsList.stream()
                .forEach(b -> {
                    boolean isSafe = rule.validate(b);

                    b.display();
                    if (isSafe) {
                        System.out.println("Status: SAFE\n");
                    } else {
                        System.out.println("Status: UNSAFE ❌\n");
                    }
                });
    }
}
