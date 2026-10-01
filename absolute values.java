import java.util.HashSet;

public class DistinctAbsoluteValues {

    public static int countDistinctAbs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(Math.abs(num));
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] arr = {-5, 5, -2, 2, 0, 5};

        int result = countDistinctAbs(arr);

        System.out.println("Number of distinct absolute values: " + result);
    }
}
