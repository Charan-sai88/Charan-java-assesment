import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        // Check pass or fail
        if (marks >= 70) {
            System.out.println("Student has passed the exam.");

            // Check for Grade A
            if (marks > 90) {
                System.out.println("Grade: A");
            }
        } else {
            System.out.println("Student has failed the exam.");
        }

        sc.close();
    }
}
