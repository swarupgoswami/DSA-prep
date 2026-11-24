package graph;

import java.util.*;

public class directeddfscycle {

    static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] path) {

        vis[node] = true;
        path[node] = true;

        for (int neighbour : adj.get(node)) {

            if (vis[neighbour] && path[neighbour]) {
                return true;
            }

            if (!vis[neighbour]) {
                if (dfs(neighbour, adj, vis, path)) {
                    return true;
                }
            }
        }

        path[node] = false;
        return false;
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(2).add(3);
        adj.get(3).add(0);

        boolean[] vis = new boolean[V];
        boolean[] path = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, path)) {
                    System.out.println("Cycle Exists");
                    return;
                }
            }
        }

        System.out.println("No Cycle");
    }
}