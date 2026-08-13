package array;

public class q724 {

    // Solution function outside main
    public static int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Calculate right sum
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left sum == right sum
            if (rightSum == leftSum) {
                return i;
            }

            // Add current element to left sum
            leftSum = leftSum + nums[i];
        }

        return -1;
    }


    // Main function
    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        int pivot = pivotIndex(nums);

        System.out.println(pivot);
    }
}