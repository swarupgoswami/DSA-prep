package tree;
import java.util.*;

public class levelordertraversal {

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

    public ArrayList<Integer> levelorder(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new ArrayDeque<>();

        q.offer(root);

        while (!q.isEmpty()) {

        
            TreeNode current = q.poll();

    
            ans.add(current.val);


            if (current.left != null) {
                q.offer(current.left);
            }

      
            if (current.right != null) {
                q.offer(current.right);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

   

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        levelordertraversal obj = new levelordertraversal();

        ArrayList<Integer> result = obj.levelorder(root);

     
        System.out.println(result);
    }
}