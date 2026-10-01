public class Main {

    // Recursive method
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

Output
Fibonacci Series:
0 1 1 2 3 5 8 13 21 34

How recursion works

The main recursive statement is:

return fibonacci(n - 1) + fibonacci(n - 2);


For example:

fibonacci(5)
= fibonacci(4) + fibonacci(3)
= 3 + 2
= 5


The base cases stop the recursion:

if (n == 0)
    return 0;

if (n == 1)
    return 1;


So the Fibonacci sequence is:

0, 1, 1, 2, 3, 5, 8, 13...
