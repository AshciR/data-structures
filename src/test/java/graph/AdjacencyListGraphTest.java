package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdjacencyListGraphTest{

    private Graph<String> graph;

    @BeforeEach
    void setup(){
        graph = new AdjacencyListGraph();
    }

    @Test
    void shouldAddNodes(){

        // When:
        graph.addNode("Richie");

        // Then:
        List<String> edges = graph.getEdges("Richie");
        assertEquals(0, edges.size());
    }

    @Test
    void shouldAddEdges(){
        // When:
        graph.addEdges("Richie", asList("Sasha", "Jhev", "Dwayne"));

        // Then:
        List<String> edges = graph.getEdges("Richie");
        assertEquals(3, edges.size());

    }

    @Test
    void shouldGetEdges(){
        // When:
        graph.addEdges("Sasha", asList("Gil", "Ashley"));

        // Then:
        List<String> edges = graph.getEdges("Sasha");
        assertEquals(2, edges.size());

    }
}