public class Main {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            // Find the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


Output:

Sorted array:
11 12 22 25 64


{"fallbackMarkdown":"","learningBlockPreview":{"formula":"","launchPayload":{"matchedType":"SELECTION_SORT","encodedContent":"XHRleHR7TGVhcm4gbW9yZX0=","contentType":"placeholder","encodedInitialValues":"eyJvcmRlciI6IjYsMyw4LDIsNywxLDUsNCJ9","serverLearningBlockVersion":2,"widgetType":"learning_viz"},"learnMoreLabel":"Learn more","previewContent":"learn_more","thumbnailAssetKey":"selection-sort-v1"},"reference":{"type":"client_defined_widget"},"referenceKey":"0","showLoginRequiredCard":true}

2. Insertion Sort
public class Main {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Move larger elements one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key in correct position
            arr[j + 1] = key;
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


Output:

Sorted array:
11 12 22 25 64


{"fallbackMarkdown":"","learningBlockPreview":{"formula":"","launchPayload":{"matchedType":"INSERTION_SORT","encodedContent":"XHRleHR7TGVhcm4gbW9yZX0=","contentType":"placeholder","encodedInitialValues":"eyJ2YWx1ZTEiOjcuMCwidmFsdWUyIjozLjAsInZhbHVlMyI6OC4wLCJ2YWx1ZTQiOjIuMCwidmFsdWU1Ijo2LjAsInZhbHVlNiI6NC4wLCJ2YWx1ZTciOjUuMH0=","serverLearningBlockVersion":1,"widgetType":"learning_viz"},"learnMoreLabel":"Learn more","previewContent":"learn_more","thumbnailAssetKey":"insertion-sort-v1"},"reference":{"type":"client_defined_widget"},"referenceKey":"1","showLoginRequiredCard":true}

Easy difference to remember

Selection Sort: Find the smallest element and swap it into position.

Insertion Sort: Take one element and insert it into its correct position among the already sorted elements.
