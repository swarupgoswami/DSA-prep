package tree;

import java.util.*;

public class q173 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    static class BSTIterator {

        Stack<TreeNode> stack = new Stack<>();

      
        BSTIterator(TreeNode root) {
            pushLeft(root);
        }

       
        private void pushLeft(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

       
        public int next() {

            TreeNode node = stack.pop();

            
            if (node.right != null) {
                pushLeft(node.right);
            }

            return node.val;
        }

       
        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }

    public static void main(String[] args) {

        

        TreeNode root = new TreeNode(7);

        root.left = new TreeNode(3);

        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

 
        BSTIterator iterator = new BSTIterator(root);

        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}