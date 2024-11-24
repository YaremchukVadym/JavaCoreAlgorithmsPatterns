package AdvancedJava.AnotherTopic.TestTast;

import java.util.*;

public class ShortestPath {

    // Class representing a graph edge
    static class Edge {
        int to, cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    // Dijkstra's algorithm to find shortest path
    public static int dijkstra(Map<String, Integer> cityIndex, List<Edge>[] graph, String start, String end) {
        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        int startIdx = cityIndex.get(start);
        int endIdx = cityIndex.get(end);

        dist[startIdx] = 0;
        pq.add(new int[]{startIdx, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0], cost = current[1];

            if (node == endIdx) return cost;

            if (cost > dist[node]) continue;

            for (Edge edge : graph[node]) {
                int next = edge.to;
                int newCost = cost + edge.cost;

                if (newCost < dist[next]) {
                    dist[next] = newCost;
                    pq.add(new int[]{next, newCost});
                }
            }
        }

        return -1; // No path found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt(); // Number of cities
            scanner.nextLine(); // Move to the next line

            Map<String, Integer> cityIndex = new HashMap<>();
            List<Edge>[] graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

            // Read cities and their neighbors
            for (int i = 1; i <= n; i++) {
                String cityName = scanner.nextLine();
                cityIndex.put(cityName, i);

                int neighbors = scanner.nextInt();
                for (int j = 0; j < neighbors; j++) {
                    int neighbor = scanner.nextInt();
                    int cost = scanner.nextInt();
                    graph[i].add(new Edge(neighbor, cost));
                }
                scanner.nextLine(); // Move to the next line
            }

            // Read and process queries
            int queries = scanner.nextInt();
            scanner.nextLine(); // Move to the next line

            for (int q = 0; q < queries; q++) {
                String[] query = scanner.nextLine().split(" ");
                String source = query[0], destination = query[1];
                int cost = dijkstra(cityIndex, graph, source, destination);
                System.out.println(cost);
            }

            if (t < testCases - 1) scanner.nextLine(); // Empty line between test cases
        }

        scanner.close();
    }
}
