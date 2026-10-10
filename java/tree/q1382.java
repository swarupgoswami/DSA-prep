
package tree;

import java.util.ArrayList;
import java.util.List;

public class q1382 {


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static void inorder(TreeNode root, List<Integer> values) {

        if (root == null) {
            return;
        }

        inorder(root.left, values);

        values.add(root.val);

        inorder(root.right, values);
    }


    public static TreeNode buildBalancedBST(
            List<Integer> values, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

      
        int currentValue = values.get(mid);
        TreeNode root = new TreeNode(currentValue);


        TreeNode leftChild =
                buildBalancedBST(values, left, mid - 1);

        TreeNode rightChild =
                buildBalancedBST(values, mid + 1, right);

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static TreeNode balanceBST(TreeNode root) {

        List<Integer> values = new ArrayList<>();

       
        inorder(root, values);

     
        TreeNode balancedRoot =
                buildBalancedBST(values, 0, values.size() - 1);

        return balancedRoot;
    }

    public static void printInorder(TreeNode root) {

        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        System.out.println("Before balancing:");
        printInorder(root);

  
        TreeNode balancedRoot = balanceBST(root);

        System.out.println("\nAfter balancing (inorder):");
        printInorder(balancedRoot);

        System.out.println("\nNew root: " + balancedRoot.val);
    }
}