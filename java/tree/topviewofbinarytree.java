package tree;

import java.util.*;

public class topviewofbinarytree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }


    static void topView(Node root) {

        if (root == null) {
            return;
        }

        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }


            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }


            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        
        for (int value : map.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

       
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.right.left = new Node(4);
        root.right.right = new Node(5);

        

        

        System.out.println("Top View of Binary Tree:");

        topView(root);
    }
}