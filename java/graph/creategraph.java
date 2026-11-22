
package graph;

import java.util.*;

public class creategraph {

    static ArrayList<ArrayList<Integer>> adj;


    static void createGraph(int V) {

        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

   
    static void addEdge(int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    static void printGraph(int V) {

        for (int i = 0; i < V; i++) {

            System.out.print(i + " -> ");

            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int V = 4;

        createGraph(V);

        
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 3);

        printGraph(V);
    }
}
