package tree;

public class q112{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.val=data;
            left=null;
            right=null;
        }

    }
    public boolean pathsum(TreeNode root,int targetsum){
        if(root==null){
            return false;
        }
        targetsum-=root.val;

        if(root.left==null && root.right==null){
            return targetsum==0;
        }


        boolean left=pathsum(root.left,targetsum);
        boolean right=pathsum(root.right,targetsum);

        return left||right;
    } 
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        root.right.right.right = new TreeNode(1);

        q112 obj = new q112();

        int targetsum = 22;

        boolean ans = obj.pathsum(root, targetsum);

        System.out.println("Path exists: " + ans);
    }
}