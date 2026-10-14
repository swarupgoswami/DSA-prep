package tree;

public class q1373 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Info {
        int min;
        int max;
        int sum;

        Info(int min, int max, int sum) {
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    static int maxSum;

    public static int solve(TreeNode root) {
        maxSum = 0;
        postorder(root);
        return maxSum;
    }

    public static Info postorder(TreeNode root) {

        
        if (root == null) {
            return new Info(
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0
            );
        }

        
        Info left = postorder(root.left);
        Info right = postorder(root.right);

        
        if (root.val > left.max && root.val < right.min) {

            int sum = left.sum + right.sum + root.val;

            maxSum = Math.max(maxSum, sum);

            int min = Math.min(root.val, left.min);
            int max = Math.max(root.val, right.max);

            return new Info(min, max, sum);
        }

        
        return new Info(
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            0
        );
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(5);

        root.right.right.left = new TreeNode(4);
        root.right.right.right = new TreeNode(6);

        int ans = solve(root);

        System.out.println("Maximum Sum BST: " + ans);
    }
}