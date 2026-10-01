import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Original LinkedList: " + list);

        // Accessing elements

        // Access first element
        System.out.println("First element: " + list.getFirst());

        // Access last element
        System.out.println("Last element: " + list.getLast());

        // Access element using index
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements

        // Remove first element
        list.removeFirst();
        System.out.println("After removing first: " + list);

        // Remove last element
        list.removeLast();
        System.out.println("After removing last: " + list);

        // Remove element using index
        list.remove(1);
        System.out.println("After removing index 1: " + list);

        // Remove element using value
        list.remove("Mango");
        System.out.println("After removing Mango: " + list);
    }
}
