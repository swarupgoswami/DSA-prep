package tree;

import java.util.HashMap;

public class q105 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length - 1,
                     inorder, 0, inorder.length - 1, map);
    }

    private static TreeNode build(
            int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd,
            HashMap<Integer, Integer> map) {

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

     
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);

   
        int rootIndex = map.get(rootValue);

       
        int leftSize = rootIndex - inStart;

        root.left = build(
                preorder,
                preStart + 1,
                preStart + leftSize,
                inorder,
                inStart,
                rootIndex - 1,
                map
        );

        root.right = build(
                preorder,
                preStart + leftSize + 1,
                preEnd,
                inorder,
                rootIndex + 1,
                inEnd,
                map
        );

        return root;
    }

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);

        System.out.println(root.val);
    }
}
