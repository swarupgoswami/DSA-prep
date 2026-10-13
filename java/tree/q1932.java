package tree;

import java.util.*;

public class q1932 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode canMerge(List<TreeNode> trees) {
        Map<Integer, TreeNode> roots = new HashMap<>();
        Set<Integer> leaves = new HashSet<>();

        for (TreeNode root : trees) {
            roots.put(root.val, root);

            if (root.left != null) leaves.add(root.left.val);
            if (root.right != null) leaves.add(root.right.val);
        }

        TreeNode root = null;

        for (TreeNode node : trees) {
            if (!leaves.contains(node.val)) {
                if (root != null) return null;
                root = node;
            }
        }

        if (root == null) return null;

        roots.remove(root.val);

        if (!merge(root, Long.MIN_VALUE, Long.MAX_VALUE, roots)) {
            return null;
        }

        if (!roots.isEmpty()) return null;

        return root;
    }

    private static boolean merge(
            TreeNode node,
            long min,
            long max,
            Map<Integer, TreeNode> roots) {

        if (node == null) return true;

        if (node.val <= min || node.val >= max) {
            return false;
        }

        if (node.left == null && node.right == null) {
            TreeNode subtree = roots.remove(node.val);

            if (subtree != null) {
                node.left = subtree.left;
                node.right = subtree.right;
            }
        }

        return merge(node.left, min, node.val, roots)
                && merge(node.right, node.val, max, roots);
    }

    public static void solve() {
        List<TreeNode> trees = new ArrayList<>();

        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(1);

        TreeNode t2 = new TreeNode(3);
        t2.left = new TreeNode(2);

        trees.add(t1);
        trees.add(t2);

        TreeNode root = canMerge(trees);

        if (root != null) {
            System.out.println("Merge done");
            System.out.print("Inorder: ");
            inorder(root);
            System.out.println();
        } else {
            System.out.println("Merge failed");
        }
    }

    private static void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        solve();
    }
}

