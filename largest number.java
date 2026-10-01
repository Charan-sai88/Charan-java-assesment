public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 45, 32};

        // Assume the first element is the largest
        int largest = numbers[0];

        // Compare with remaining elements
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}
