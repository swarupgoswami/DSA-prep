package array;

import java.util.*;

public class q1122 {

    // Function outside main
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of elements in arr1
        for (var x : arr1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int index = 0;

        // Put elements according to arr2 order
        for (int num : arr2) {

            if (map.containsKey(num)) {

                int count = map.get(num);

                while (count > 0) {
                    arr1[index] = num;
                    index++;
                    count--;
                }

                map.remove(num);
            }
        }

        // Store remaining elements
        ArrayList<Integer> list = new ArrayList<>();

        for (var x : map.entrySet()) {

            int count = x.getValue();

            while (count > 0) {
                list.add(x.getKey());
                count--;
            }
        }

        // Sort remaining elements
        Collections.sort(list);

        // Put remaining elements into arr1
        for (int num : list) {
            arr1[index] = num;
            index++;
        }

        return arr1;
    }


    // Main function
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};

        int[] arr2 = {2, 1, 4, 3, 9, 6};

        // Calling the function
        int[] sortedarray = relativeSortArray(arr1, arr2);

        // Print result
        System.out.println(Arrays.toString(sortedarray));
    }
}