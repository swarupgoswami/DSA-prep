package tree;

public class q1008 {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int index = 0;

    // LeetCode 1008 solution
    public static TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return build(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    
    private static TreeNode build(int[] preorder, int min, int max) {

        
        if (index >= preorder.length) {
            return null;
        }

        
        if (preorder[index] <= min || preorder[index] >= max) {
            return null;
        }

       
        TreeNode root = new TreeNode(preorder[index]);
        index++;

        root.left = build(preorder, min, root.val);
        root.right = build(preorder, root.val, max);

        return root;
    }

    public static void main(String[] args) {

        int[] preorder = {8, 5, 1, 7, 10, 12};

        TreeNode root = bstFromPreorder(preorder);

        System.out.println("BST created successfully!");
        System.out.println("Root: " + root.val);
    }
}
