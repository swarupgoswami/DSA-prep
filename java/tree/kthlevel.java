
package tree;

public class kthlevel {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void kthLevel(Node root, int k) {

        if (root == null) {
            return;
        }

        if (k == 1) {
            System.out.print(root.data + " ");
            return;
        }

        kthLevel(root.left, k - 1);
        kthLevel(root.right, k - 1);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        int k = 3;

        kthLevel(root, k);
    }
}

