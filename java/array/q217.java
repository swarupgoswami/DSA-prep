package array;

import java.util.HashSet;

public class q217 {

    public boolean conatainduplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (set.contains(x)) {
                return true;
            } else {
                set.add(x);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 2};

        q217 obj = new q217();

        boolean result = obj.conatainduplicate(nums);

        System.out.println(result);
    }
}