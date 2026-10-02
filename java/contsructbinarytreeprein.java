public class contsructbinarytreeprein {

    static int preorderIndex = 0;

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    static TreeNode build(int[] preorder, int[] inorder, int left, int right) {


        if (left > right) {
            return null;
        }


        int rootValue = preorder[preorderIndex++];

        TreeNode root = new TreeNode(rootValue);


        int index = search(inorder, left, right, rootValue);


        root.left = build(preorder, inorder, left, index - 1);


        root.right = build(preorder, inorder, index + 1, right);

        return root;
    }


    static int search(int[] inorder, int left, int right, int value) {

        for (int i = left; i <= right; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }

        return -1;
    }

  
    static void printInorder(TreeNode root) {

        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

    
        TreeNode root = build(
            preorder,
            inorder,
            0,
            inorder.length - 1
        );

        System.out.println("Inorder of constructed tree:");

        printInorder(root);
    }
}