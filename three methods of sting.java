public class Main {
    public static void main(String[] args) {

        String str = "Hello Java";

        // 1. length() - finds the length of the string
        System.out.println("Length: " + str.length());

        // 2. toUpperCase() - converts string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. charAt() - returns character at a particular index
        System.out.println("Character at index 1: " + str.charAt(1));
    }
}

Output
Length: 10
Uppercase: HELLO JAVA
Character at index 1: e

Three String methods used

length() → returns the number of characters.

toUpperCase() → converts the string to uppercase.

charAt(index) → returns the character at the specified index.

For "Hello Java", index starts from 0:

H  e  l  l  o     J  a  v  a
0  1  2  3  4  5  6  7  8  9
