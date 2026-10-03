public class sortedarraytobalancedbst {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int low, int high) {

    
        if (low > high) {
            return null;
        }

       
        int mid = low + (high - low) / 2;

        TreeNode root = new TreeNode(nums[mid]);

    
        root.left = build(nums, low, mid - 1);

      
        root.right = build(nums, mid + 1, high);

        return root;
    }

   
    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        sortedarraytobalancedbst obj = new sortedarraytobalancedbst();

        TreeNode root = obj.sortedArrayToBST(nums);

        System.out.println("Inorder traversal:");
        obj.inorder(root);
    }
}