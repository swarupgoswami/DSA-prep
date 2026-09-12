package tree;

public class q230 {

    static int order = 0;
    static int ans = 0;


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }


    public static void inorder(Node root, int k) {

        if (root == null) {
            return;
        }
        inorder(root.left, k);

        order++;

    
        if (order == k) {
            ans = root.data;
            return;
        }
        inorder(root.right, k);
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(6);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.left.left.left = new Node(1);

        int k = 3;
        inorder(root, k);

        System.out.println("Kth smallest element = " + ans);
    }
}