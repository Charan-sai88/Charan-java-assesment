public class Main {
    public static void main(String[] args) {

        String sentence = "Java is a programming language";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        System.out.println("Original sentence: " + sentence);

        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Rebuild the sentence in a new format
        String newSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            newSentence = newSentence + words[i] + " ";
        }

        System.out.println("New sentence: " + newSentence.trim());
    }
}

Output
Original sentence: Java is a programming language

Words:
Java
is
a
programming
language

New sentence: language programming a is Java

Main idea

The important method is:

String[] words = sentence.split(" ");


It divides the sentence into individual words.

For example:

"Java is a programming language"
          ↓
["Java", "is", "a", "programming", "language"]


Then the for loop goes backwards and rebuilds the sentence:

language programming a is Java
