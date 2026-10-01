import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Go for a walk");

        System.out.println("Tasks:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Removing a task
        tasks.remove("Study for exam");

        System.out.println("\nAfter removing a task:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
