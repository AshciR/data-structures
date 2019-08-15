package graph;

import java.util.List;

public interface Graph <T>{
    void addNode(T node);
    void addEdges(T node, List<T> edges);
    List<T> getEdges(T node);
}
