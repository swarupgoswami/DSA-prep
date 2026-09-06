package tree;

public class q101 {

    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    static boolean solve(TreeNode left, TreeNode right) {


        if (left == null && right == null) {
            return true;
        }

      
        if (left == null || right == null) {
            return false;
        }

   
        if (left.val != right.val) {
            return false;
        }

    
        return solve(left.left, right.right)
                && solve(left.right, right.left);
    }


    public static void main(String[] args) {

 

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);


        boolean ans = solve(root.left, root.right);

        System.out.println(ans);
    }
}