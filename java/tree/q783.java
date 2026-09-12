package tree;



public class q783 {

    static int prev = -1;
    static int ans = Integer.MAX_VALUE;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

   
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }


        inorder(root.left);


        if (prev != -1) {
            ans = Math.min(ans, root.data - prev);
        }

        prev = root.data;

      
        inorder(root.right);
    }

    public static void main(String[] args) {

        

        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        
        inorder(root);

        System.out.println("Minimum difference = " + ans);
    }
}