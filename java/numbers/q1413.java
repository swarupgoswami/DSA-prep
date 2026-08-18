package numbers;

public class q1413 {

    // Function containing the LeetCode solution
    public static int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;

        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }

        return 1 - minSum;
    }

    public static void main(String[] args) {

        int[] nums = {-3, 2, -3, 4, 2};

        // Calling the solution function
        int answer = minStartValue(nums);

        System.out.println("Minimum Start Value: " + answer);
    }
}