
package tree;

import java.util.*;

public class q257 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        path(root, "", ans);

        return ans;
    }

    static void path(TreeNode root, String str, List<String> ans) {

        str = str + root.val;

    
        if (root.left == null && root.right == null) {
            ans.add(str);
            return;
        }

        
        if (root.left != null) {
            path(root.left, str + "->", ans);
        }

        
        if (root.right != null) {
            path(root.right, str + "->", ans);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);

        List<String> result = binaryTreePaths(root);

        System.out.println(result);
    }
}

