package graph;

import java.util.*;

public class bfs {

    public static void bfsTraversal() {

        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

       
        adj.get(0).add(1);

        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(4);

        
        boolean[] visited = new boolean[5];

        
        Deque<Integer> q = new ArrayDeque<>();

        
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            System.out.print(node + " ");

          
            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        bfsTraversal();

    }
}