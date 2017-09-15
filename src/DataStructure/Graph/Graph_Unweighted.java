package DataStructure.Graph;

import java.util.*;

public class Graph_Unweighted {

    private Set<String> vertices;
    private Map<String, Set<String>> edges; // stores a->b and b->a

    public Graph_Unweighted() {
        this.edges = new HashMap<>();
        vertices = new HashSet<>();
    }

    public void addVertex(String vertex) {
        vertices.add(vertex);
    }

    public void addEdge(String vertexA, String vertexB) {
        if (!vertices.contains(vertexA) || !vertices.contains(vertexB))
            return;

        if (!edges.containsKey(vertexA)) {
            edges.put(vertexA, new HashSet<>());
        }
        edges.get(vertexA).add(vertexB);

        if (!edges.containsKey(vertexB)) {
            edges.put(vertexB, new HashSet<>());
        }
        edges.get(vertexB).add(vertexA);

    }

    public void bfs() {
        Set<String> traversed = new HashSet<>();
        for (String v : vertices) {
            System.out.print(v + " : ");
            for (String e : edges.get(v)) {
                if (!traversed.contains(e)) {
                    System.out.print(e + " ");
                }
            }
            System.out.println();
            traversed.add(v);
        }
    }

    public void dfs() {
        Set<String> traversed = new HashSet<>();
        Stack<String> stack = new Stack<>();
        for(String v: vertices){
            if(!traversed.contains(v)){
                stack.push(v);
                String e = stack.pop();
                System.out.print(e+" ");
                for(String neighbor: edges.get(e)){
                    if(!traversed.contains(neighbor)){
                        stack.push(neighbor);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph_Unweighted graph = new Graph_Unweighted();
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addVertex("f");
        graph.addVertex("g");
        graph.addEdge("a", "b");
        graph.addEdge("a", "c");
        graph.addEdge("b", "f");
        graph.addEdge("c", "d");
        graph.addEdge("f", "e");
        graph.addEdge("g", "c");
        graph.addEdge("g", "e");
        System.out.println("BFS : ");
        graph.bfs();
        System.out.println("\nDFS : ");
        graph.dfs();
    }
}

/*
* undirected
* directed
* weighted edge
* weighted vertices
*
* */
