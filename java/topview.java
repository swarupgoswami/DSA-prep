import java.util.*;

public class topview {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    class pair {
        TreeNode node;
        int hd;

        pair(TreeNode root, int val) {
            node = root;
            hd = val;
        }
    }

    public int[] topviewofbinarytree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return new int[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<pair> dq = new ArrayDeque<>();

        dq.addLast(new pair(root, 0));

        while (!dq.isEmpty()) {
            pair current = dq.removeFirst();
            TreeNode node = current.node;
            int currhd = current.hd;

            if (map.containsKey(currhd)) {
                continue;
            }

            map.put(currhd, node.val);

            if (node.left != null) {
                dq.addLast(new pair(node.left, currhd - 1));
            }

            if (node.right != null) {
                dq.addLast(new pair(node.right, currhd + 1));
            }
        }

        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);

        for (int value : sortedMap.values()) {
            list.add(value);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        topview obj = new topview();

        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.right = obj.new TreeNode(4);
        root.right.right = obj.new TreeNode(5);
        root.right.right.left = obj.new TreeNode(6);

        int[] ans = obj.topviewofbinarytree(root);

        System.out.println(Arrays.toString(ans));
    }
}