package tree;

public class morrisinordertraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Morris Inorder Traversal
    public static void morrisInorder(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {

            // If there is no left subtree
            if (curr.left == null) {
                System.out.print(curr.val + " ");
                curr = curr.right;
            }

            else {
                // Find inorder predecessor
                TreeNode predecessor = curr.left;

                while (predecessor.right != null && predecessor.right != curr) {
                    predecessor = predecessor.right;
                }

                // Create a temporary thread
                if (predecessor.right == null) {
                    predecessor.right = curr;
                    curr = curr.left;
                }

                // Remove the thread and visit current node
                else {
                    predecessor.right = null;
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creating the tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calling Morris Inorder Traversal
        morrisInorder(root);
    }
}