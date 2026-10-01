public class ExceptionDemo {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }
        finally {
            System.out.println("Arithmetic block completed.");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {10, 20, 30};

            System.out.println("Element: " + numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Index is out of bounds.");
        }
        finally {
            System.out.println("Array block completed.");
        }
    }
}
