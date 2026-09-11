package tree;

public class q98 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean solve(TreeNode root, TreeNode min, TreeNode max) {

        if (root == null) {
            return true;
        }

        if (min != null && root.val <= min.val) {
            return false;
        }

        if (max != null && root.val >= max.val) {
            return false;
        }

        boolean left = solve(root.left, min, root);
        boolean right = solve(root.right, root, max);

        return left && right;
    }

    public static void main(String[] args) {

    

        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean ans = solve(root, null, null);

        System.out.println(ans);
    }
}
