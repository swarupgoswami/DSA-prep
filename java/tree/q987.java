package tree;

import java.util.*;

public class q987 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class NodeInfo {
        TreeNode node;
        int row;
        int col;

        NodeInfo(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {

    
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

       
        List<List<Integer>> answer = levelordertraversalcoloumn(root);

        System.out.println(answer);
    }

    public static List<List<Integer>> levelordertraversalcoloumn(TreeNode root) {

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map
                = new TreeMap<>();

        Queue<NodeInfo> queue = new LinkedList<>();

        queue.offer(new NodeInfo(root, 0, 0));

        while (!queue.isEmpty()) {

            NodeInfo current = queue.poll();

            TreeNode node = current.node;
            int row = current.row;
            int col = current.col;

            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());

            map.get(col).get(row).offer(node.val);

            if (node.left != null) {
                queue.offer(new NodeInfo(node.left, row + 1, col - 1));
            }

            if (node.right != null) {
                queue.offer(new NodeInfo(node.right, row + 1, col + 1));
            }
        }

        List<List<Integer>> answer = new ArrayList<>();

        for (var columnEntry : map.entrySet()) {

            TreeMap<Integer, PriorityQueue<Integer>> rows
                    = columnEntry.getValue();

            List<Integer> vertical = new ArrayList<>();

            for (var rowEntry : rows.entrySet()) {

                PriorityQueue<Integer> values = rowEntry.getValue();

                while (!values.isEmpty()) {
                    vertical.add(values.poll());
                }
            }

            answer.add(vertical);
        }

        return answer;
    }
}