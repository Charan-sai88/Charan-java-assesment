import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        // Check each character
        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels = " + count);

        sc.close();
    }
}

Example output
Enter a string: Hello World
Number of vowels = 3


The program checks each character using:

if (ch == 'a' || ch == 'e' || ch == 'i' ||
    ch == 'o' || ch == 'u')


So it counts both uppercase and lowercase vowels because Character.toLowerCase() converts the character to lowercase first.
