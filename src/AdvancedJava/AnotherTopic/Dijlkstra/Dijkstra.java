package AdvancedJava.AnotherTopic.Dijlkstra;

import java.util.PriorityQueue;

public class Dijkstra {

    PriorityQueue<Vertex> queue;

    public Dijkstra() {
        queue = new PriorityQueue<>();
    }

    public void compute(Vertex source) {
        source.setDistance(0);
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();

            for(Edge e : current.getNeighbours()){
                Vertex end = e.getEnd();
                double w = e.getWeight();

                if(!end.isVisited()){
                    if(current.getDistance() + w < current.getDistance()){
                        end.setDistance(current.getDistance() + w);
                        if(queue.contains(end)){
                            queue.remove(end);
                            queue.add(end);
                            end.setPredecessor(current);
                        }
                    }
                }
                current.setVisited(true);
            }
        }
    }
}
