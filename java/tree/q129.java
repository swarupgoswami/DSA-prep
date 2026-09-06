package tree;

public class q129 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static int solve(TreeNode root, int currentSum) {

        if (root == null) {
            return 0;
        }

        currentSum = currentSum * 10 + root.val;

        if (root.left == null && root.right == null) {
            return currentSum;
        }

        return solve(root.left, currentSum)
                + solve(root.right, currentSum);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int ans = solve(root, 0);

        System.out.println(ans);
    }
}