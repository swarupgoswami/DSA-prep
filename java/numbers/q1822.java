package numbers;

public class q1822 {

    // Function to find the sign of the product
    public static int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                negativeCount++;
            }
        }

        return (negativeCount % 2 == 0) ? 1 : -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int ans = arraySign(nums);

        System.out.println("Sign of the product: " + ans);
    }
}