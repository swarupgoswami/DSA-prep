package deque;

import java.util.*;

class slidingwindowmaximum{
    public static void main(String [] args){
        int [] nums= {1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;

         Deque<Integer> dq = new ArrayDeque<>();

        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;

        // First window
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);
        }

        // Maximum of first window
        ans[idx++] = nums[dq.peekFirst()];

        // Remaining windows
        for (int i = k; i < n; i++) {

            // Remove indices that are outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            // Maximum is always at front
            ans[idx++] = nums[dq.peekFirst()];
        }

        // Print answer
        System.out.println(Arrays.toString(ans));
    }
}