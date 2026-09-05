package tree;

public class q100 {
    static class root {
        int val;
        root left;
        root right;

        root(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isidentical(root p, root q) {

        if (p == null || q == null) {
            return p == q;
        }

        boolean lefts = isidentical(p.left, q.left);
        boolean rights = isidentical(p.right, q.right);
        return p.val == q.val && lefts && rights ? true : false;
    }

    public static void main(String[] args) {
         q100 obj = new q100();

        // First tree
        root p = new root(1);
        p.left = new root(2);
        p.right = new root(3);
        p.left.left = new root(4);
        p.left.right = new root(5);

        // Second tree
        root q = new root(1);
        q.left = new root(2);
        q.right = new root(3);
        q.left.left = new root(4);
        q.left.right = new root(5);

        // Calling the function
        boolean ans = obj.isidentical(p, q);

        System.out.println(ans);

    }
}