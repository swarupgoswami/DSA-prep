package tree;
public class sumtree{
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }
    static int sumtreefunction(TreeNode root){
      if(root==null) return 0;

        int left=sumtreefunction(root.left);
        int right=sumtreefunction(root.right);
        root.data=root.data+left+right;
        return root.data;
    }
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(1);

        System.out.println(sumtreefunction(root));
    }
}