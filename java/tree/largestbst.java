package tree;

public class largestbst {

    // Stores information about each subtree
    static class Info {
        int min;
        int max;
        int currSize;

        Info(int min, int max, int currSize) {
            this.min = min;
            this.max = max;
            this.currSize = currSize;
        }
    }

    // Keeps track of the largest BST found
    static int maxSize = 0;

    // Function to find the largest BST
    static Info largestBST(Node root) {

        // Base case
        if (root == null) {
            return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        // Recursive call for left subtree
        Info leftInfo = largestBST(root.left);

        // Recursive call for right subtree
        Info rightInfo = largestBST(root.right);

        // Check whether current subtree is a BST
        if (leftInfo.max < root.data &&
            root.data < rightInfo.min) {

            int currSize = leftInfo.currSize
                         + rightInfo.currSize
                         + 1;

            int currMin = Math.min(root.data, leftInfo.min);
            int currMax = Math.max(root.data, rightInfo.max);

            maxSize = Math.max(maxSize, currSize);

            return new Info(currMin, currMax, currSize);
        }

        // Current subtree is not a BST
        return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
    }

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

    

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(60);

        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right.left = new Node(45);
        root.right.right = new Node(70);

        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        maxSize = 0;

        largestBST(root);

        System.out.println("Size of largest BST: " + maxSize);
    }
}
