public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate sum
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

Output
Sum = 150
Average = 30.0

Logic

For the array:

10 + 20 + 30 + 40 + 50 = 150


Average:

150 / 5 = 30


The important part is:

int sum = 0;

for (int i = 0; i < numbers.length; i++) {
    sum = sum + numbers[i];
}

double average = (double) sum / numbers.length;


The (double) ensures that the average is calculated correctly even when the result contains decimal values.
