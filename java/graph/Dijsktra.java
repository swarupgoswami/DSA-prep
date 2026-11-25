package graph;

import java.util.*;

public class Dijsktra {

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void dijkstra(ArrayList<ArrayList<Pair>> adj, int src, int V) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.distance - b.distance
        );

        dist[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.node;
            int d = curr.distance;

            if (d > dist[node]) {
                continue;
            }

            for (Pair neighbour : adj.get(node)) {

                int adjNode = neighbour.node;
                int weight = neighbour.distance;

                if (d + weight < dist[adjNode]) {

                    dist[adjNode] = d + weight;

                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        System.out.println("Shortest distances from source " + src + ":");

        for (int i = 0; i < V; i++) {
            System.out.println("0 -> " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(2, 4));

        adj.get(1).add(new Pair(2, 1));
        adj.get(1).add(new Pair(3, 7));

        adj.get(2).add(new Pair(4, 3));

        adj.get(4).add(new Pair(3, 2));
        adj.get(3).add(new Pair(5, 1));
        adj.get(4).add(new Pair(5, 5));

        dijkstra(adj, 0, V);
    }
}