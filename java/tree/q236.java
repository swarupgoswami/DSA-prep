
package tree;

public class q236 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        }

        return right;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        Node p = root.left.left;
        Node q = root.left.right;

        Node lca = lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor: " + lca.data);
    }
}

