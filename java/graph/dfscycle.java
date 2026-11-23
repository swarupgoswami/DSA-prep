package graph;

import java.util.*;

public class dfscycle {

    public static boolean detectCycle(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        visited[node] = true;

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {

                if (detectCycle(neighbour, node, adj, visited)) {
                    return true;
                }

            } else if (neighbour != parent) {

                return true;
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

                if (detectCycle(i, -1, adj, visited)) {
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