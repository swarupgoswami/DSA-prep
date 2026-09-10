package tree;

public class bst {


    // BST NODE


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }



    // INSERT


    static Node insert(Node root, int val) {

        // If root is null,
        // create a new node
        if (root == null) {
            return new Node(val);
        }

        // Smaller value → left
        if (val < root.data) {
            root.left = insert(root.left, val);
        }

        // Greater value → right
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }


    // BUILD BST


    static Node buildBST(int[] arr) {

        Node root = null;

        for (int val : arr) {
            root = insert(root, val);
        }

        return root;
    }



    // SEARCH


    static boolean search(Node root, int key) {

        // Key doesn't exist
        if (root == null) {
            return false;
        }

        // Key found
        if (root.data == key) {
            return true;
        }

        // Key smaller → search left
        if (key < root.data) {
            return search(root.left, key);
        }

        // Key greater → search right
        return search(root.right, key);
    }


    // FIND INORDER SUCCESSOR


    static Node getSuccessor(Node root) {

        // Go as far left as possible
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }



    // DELETE NODE
 

    static Node delNode(Node root, int key) {

        if (root == null) {
            return null;
        }

        
        if (key < root.data) {
            root.left = delNode(root.left, key);
        }

        
        else if (key > root.data) {
            root.right = delNode(root.right, key);
        }

        
        else {

       
            // CASE 1:
            // No left child
           

            if (root.left == null) {
                return root.right;
            }


            
            // CASE 2:
            // No right child
         

            if (root.right == null) {
                return root.left;
            }


  
            // CASE 3:
            // Two children
  

            // Find smallest value
            // in right subtree
            Node successor = getSuccessor(root.right);

            // Copy successor's value
            root.data = successor.data;

            // Delete original successor
            root.right = delNode(root.right, successor.data);
        }

        return root;
    }


    // INORDER TRAVERSAL


    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }


   
    // MAIN
    

    public static void main(String[] args) {

        int[] arr = {8, 5, 10, 3, 6, 12};

        // Build BST
        Node root = buildBST(arr);


        // Print BST
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();


        // Search
        int key = 4;

        if (search(root, key)) {
            System.out.println(key + " found in BST");
        } else {
            System.out.println(key + " not found in BST");
        }


        // Delete
        root = delNode(root, 5);

        System.out.print("After deleting 5: ");
        inorder(root);
        System.out.println();
    }
}