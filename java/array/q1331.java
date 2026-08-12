package array;

import java.util.Arrays;
import java.util.HashMap;


public class q1331 {

    public int[] replacewithrank(int[] arr) {

        // Make a copy of the original array
        int[] sorted = arr.clone();

        // Sort the copy
        Arrays.sort(sorted);

        // Store element -> rank
        HashMap<Integer, Integer> rank = new HashMap<>();

        int r = 1;

        // Assign rank to unique elements
        for (int num : sorted) {
            if (!rank.containsKey(num)) {
                rank.put(num, r++);
            }
        }

        // Replace original elements with their rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {40, 10, 20, 10, 30};

        // Create object
        q1331 obj = new q1331();

        // Call the function
        int[] result = obj.replacewithrank(arr);

        // Print result
        System.out.println(Arrays.toString(result));
    }
}