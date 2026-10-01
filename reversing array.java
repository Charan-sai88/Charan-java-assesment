public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        // Reverse the array in place
        while (start < end) {

            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

Output
Reversed array:
5 4 3 2 1

How it works

Initially:

1  2  3  4  5
↑           ↑
start       end


Swap 1 and 5:

5  2  3  4  1


Then swap 2 and 4:

5  4  3  2  1


The middle element 3 doesn't need to be moved.

The important part is:

int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;


This reverses the array without using a second array.
