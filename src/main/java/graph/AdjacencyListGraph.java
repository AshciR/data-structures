package graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;

public class AdjacencyListGraph implements Graph<String>{

    private Map<String, List<String>> adjacencyList;

    AdjacencyListGraph(){
        this.adjacencyList = new HashMap<>();
    }

    @Override
    public void addNode(String node){
        this.adjacencyList.put(node, emptyList());
    }

    @Override
    public void addEdges(String node, List<String> edges){
        this.adjacencyList.put(node, edges);
    }

    @Override
    public List<String> getEdges(String node){
        return this.adjacencyList.getOrDefault(node, emptyList());
    }
}
