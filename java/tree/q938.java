package tree;

public class q938 {

    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null) {
            return 0;
        }

        int currentValue = root.val;

   
        if (currentValue < low) {
            int rightSum = rangeSumBST(root.right, low, high);
            return rightSum;
        }

       
        if (currentValue > high) {
            int leftSum = rangeSumBST(root.left, low, high);
            return leftSum;
        }

        
        int currentSum = currentValue;

        int leftSum = rangeSumBST(root.left, low, high);
        int rightSum = rangeSumBST(root.right, low, high);

        int totalSum = currentSum + leftSum + rightSum;

        return totalSum;
    }

    public static void main(String[] args) {

   
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

   
        int low = 7;
        int high = 15;

   
        int result = rangeSumBST(root, low, high);

        System.out.println("Range Sum = " + result);
    }
}