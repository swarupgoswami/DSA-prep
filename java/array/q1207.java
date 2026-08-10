package array;

import java.util.HashMap;
import java.util.HashSet;

public class q1207 {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Check if all frequencies are unique
        HashSet<Integer> seen = new HashSet<>();

        for (var x : freq.entrySet()) {
            int count = x.getValue();

            if (seen.contains(count)) {
                return false;
            }

            seen.add(count);
        }

        return true;
    }

    public static void main(String[] args) {

        q1207 obj = new q1207();

        int[] arr = {1, 2, 2, 1, 1, 3};

        boolean result = obj.uniqueOccurrences(arr);

        System.out.println(result);
    }
}