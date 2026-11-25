package graph;

import java.util.*;

public class bellman {

    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void bellmanFord(int V, ArrayList<Edge> edges, int src) {

        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        for (int i = 0; i < V - 1; i++) {

            for (Edge e : edges) {

                if (dist[e.src] != Integer.MAX_VALUE &&
                    dist[e.src] + e.weight < dist[e.dest]) {

                    dist[e.dest] = dist[e.src] + e.weight;
                }
            }
        }

        for (Edge e : edges) {

            if (dist[e.src] != Integer.MAX_VALUE &&
                dist[e.src] + e.weight < dist[e.dest]) {

                System.out.println("Negative cycle detected!");
                return;
            }
        }

        System.out.println("Shortest distances from source " + src + ":");

        for (int i = 0; i < V; i++) {
            System.out.println(src + " -> " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, -4));
        edges.add(new Edge(1, 4, -1));
        edges.add(new Edge(2, 3, 2));
        edges.add(new Edge(3, 4, 4));

        bellmanFord(V, edges, 0);
    }
}