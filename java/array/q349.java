package array;

import java.util.HashSet;

public class q349 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add nums1 elements to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add nums2 elements to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Keep common elements in set1
        set1.retainAll(set2);

        // Convert HashSet to int[]
        int[] result = new int[set1.size()];
        int i = 0;

        for (int num : set1) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}