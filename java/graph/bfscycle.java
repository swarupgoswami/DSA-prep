package graph;

import java.util.*;

public class bfscycle {

    public static boolean detectCycle(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        Deque<int[]> q = new ArrayDeque<>();

        q.add(new int[]{start, -1});
        visited[start] = true;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int node = curr[0];
            int parent = curr[1];

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(new int[]{neighbour, node});

                } else if (neighbour != parent) {

                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(4).add(1);
        adj.get(1).add(4);

        boolean[] visited = new boolean[V];

        boolean cycle = false;

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (detectCycle(i, adj, visited)) {
                    cycle = true;
                    break;
                }
            }
        }

        if (cycle) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}