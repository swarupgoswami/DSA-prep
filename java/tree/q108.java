package tree;

public class q108 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode solve(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = solve(nums, left, mid - 1);
        root.right = solve(nums, mid + 1, right);

        return root;
    }

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = solve(nums, 0, nums.length - 1);

        System.out.println(root.val);
    }
}
