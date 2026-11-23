package graph;

import java.util.*;

public class dfs {

    public static void dfsTraversal(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

    
        System.out.print(node + " ");

       
        visited[node] = true;

   
        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {

                dfsTraversal(neighbour, adj, visited);

            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

      
        adj.get(0).add(1);

        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(4);

       
        boolean[] visited = new boolean[5];


        dfsTraversal(0, adj, visited);

    }
}