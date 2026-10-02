package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class q662 {

  
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    static class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public static int widthOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<Pair> q = new ArrayDeque<>();

        q.offer(new Pair(root, 0));

        long maxWidth = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            long firstIndex = q.peek().index;
            long lastIndex = firstIndex;

            for (int i = 0; i < size; i++) {

                Pair curr = q.poll();

                TreeNode node = curr.node;

             
                long index = curr.index - firstIndex;

                lastIndex = index;

             
                if (node.left != null) {
                    q.offer(new Pair(
                        node.left,
                        2 * index + 1
                    ));
                }

              
                if (node.right != null) {
                    q.offer(new Pair(
                        node.right,
                        2 * index + 2
                    ));
                }
            }

            long width = lastIndex + 1;

            maxWidth = Math.max(maxWidth, width);
        }

        return (int) maxWidth;
    }

    public static void main(String[] args) {

        

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int ans = widthOfBinaryTree(root);

        System.out.println("Maximum Width = " + ans);
    }
}
