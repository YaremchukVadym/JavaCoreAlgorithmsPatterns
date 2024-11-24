package AdvancedJava.AnotherTopic.Dijlkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    boolean visited;
    List<Edge> neighbours;

    public Vertex(String name){
        this.name = name;
        neighbours = new ArrayList<>();
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

}
