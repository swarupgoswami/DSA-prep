package tree;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class q103 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();

          
            List<Integer> level = new ArrayList<>();

            
            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                level.add(node.val);

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);
            }

            
            if (!leftToRight) {
                int start = 0;
                int end = level.size() - 1;

                while (start < end) {
                    int temp = level.get(start);
                    level.set(start, level.get(end));
                    level.set(end, temp);

                    start++;
                    end--;
                }
            }

            ans.add(level);

            leftToRight = !leftToRight;
        }

        return ans;
    }

    public static void main(String[] args) {

        

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = zigzagLevelOrder(root);

        System.out.println(result);
    }
}