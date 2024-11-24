package AdvancedJava.AnotherTopic.Dijlkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    String name;
    boolean visited;
    List<Edge> neighbours;
    double distance;
    Vertex predecessor;

    public Vertex(String name){
        this.name = name;
        neighbours = new ArrayList<>();
        distance = Double.MAX_VALUE;
        predecessor = null;
    }

    public void addNeighbour(Edge e){
        neighbours.add(e);
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.distance, o.distance);
    }
}
