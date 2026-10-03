public class binarytreetolinkedlist{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode nextright = null;

    public void flatten(TreeNode root){
        if(root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.left=null;
        root.right=nextright;
        nextright=root;
    }    
    public static void main(String[]args){

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(6);
         binarytreetolinkedlist obj = new binarytreetolinkedlist();

        obj.flatten(root);


        TreeNode curr = root;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.right;
        }

        System.out.println("null");

    }
}