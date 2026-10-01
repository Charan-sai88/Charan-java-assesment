import java.util.*;

public class AnagramGroups {

    public static int countAnagramGroups(String[] arr) {

        HashSet<String> groups = new HashSet<>();

        for (String str : arr) {

            char[] ch = str.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Same sorted string means anagrams
            groups.add(new String(ch));
        }

        return groups.size();
    }

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        int result = countAnagramGroups(arr);

        System.out.println("Number of anagram groups: " + result);
    }
}
