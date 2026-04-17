import java.util.*;
import java.util.stream.*;

public class PerformanceComparisonApp {

    public static void main(String[] args) {

        // Step 1: Create large dataset
        List<Bogie> bogies = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100000; i++) {
            int capacity = 30 + rand.nextInt(100); // 30–129
            bogies.add(new Bogie("Passenger", capacity));
        }

        // 🔹 LOOP-BASED FILTERING
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 STREAM-BASED FILTERING
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Step 3: Display results
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // Step 4: Compare
        if (loopTime < streamTime) {
            System.out.println("\nLoop is faster.");
        } else if (streamTime < loopTime) {
            System.out.println("\nStream is faster.");
        } else {
            System.out.println("\nBoth have similar performance.");
        }
    }
}
