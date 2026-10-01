import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap to store country/city and population
        HashMap<String, Long> population = new HashMap<>();

        // Store population
        population.put("India", 1420000000L);
        population.put("Chennai", 13100000L);

        // Print population
        System.out.println("Population of India: " + population.get("India"));
        System.out.println("Population of Chennai: " + population.get("Chennai"));
    }
}
