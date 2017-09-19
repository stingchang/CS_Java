package DataStructure.Graph;

import java.util.*;

public class Graph {
    private Set<Node> nodes;
//    private Map<Node, Node> vertices;

    public Graph() {
        nodes = new HashSet<>();
//        vertices = new HashMap<>();
    }

    public void addEdge(Node n1, Node n2) {
        n1.neighbors.add(n2);
        n2.neighbors.add(n1);
    }

    public void addVertex(Node node) {
        nodes.add(node);
    }

    public void dfs() {
        Set<Node> visited = new HashSet<>();
        Set<Node> visiting = new HashSet<>();

        for (Node vertex : nodes) {
            if (!visited.contains(vertex) && !visiting.contains(vertex)) {
                visiting.add(vertex);
//                System.out.print("Traversing "+vertex.value);
                while (!visiting.isEmpty()) {
                    Node cur = visiting.iterator().next();
//                    System.out.println("Traversing "+cur.value);
                    for (Node nei : cur.neighbors) {
                        if (!visited.contains(nei) && !visiting.contains(nei)) {
                            visiting.add(nei);
                        }
                    }
                    System.out.print(cur.value + " ");
                    visited.add(cur);
                    visiting.remove(cur);
                }
            }

        }
    }

    public void bfs() {
        Deque<Node> queue_visited = new ArrayDeque<>();
        Deque<Node> queue_visiting = new ArrayDeque<>();
        for (Node node : nodes) {
            if (!queue_visited.contains(node) && !queue_visiting.contains(node)) {
                queue_visiting.add(node);
            }
            while (!queue_visiting.isEmpty()) {
                Node cur = queue_visiting.getFirst();
                for (Node nei : cur.neighbors) {
                    if (!queue_visited.contains(nei) && !queue_visiting.contains(nei)) {
                        queue_visiting.addLast(nei);
                    }
                }
                System.out.print(cur.value + " ");
                queue_visiting.removeFirst();
                queue_visited.add(cur);
            }
        }
    }

    // use a bfs to check
    public boolean hasRoute(Node n1, Node n2) {
        Set<Node> visited = new HashSet<>();
        Set<Node> visiting = new HashSet<>();
        visiting.add(n1);
        while (!visiting.isEmpty()) {
            Node n = visiting.iterator().next();
            if (n == n2) return true;
            visited.add(n);
            visiting.remove(n);
            for (Node nei : n.neighbors) {
                if (nei == n2) return true;
                if (!visited.contains(nei) && !visiting.contains(nei))
                    visiting.add(nei);
            }
        }

        return false;
    }

    // cc150 4.7 topological sort
    // list<Node[]> has (n1, n2) -> n1 has to be before n2
    public void buildOrder(List<Node[]> dependencies) {
        Map<Node, Set<Node>> dependencyMap = new HashMap<>();
        for(Node[] dep: dependencies){
            if(dependencyMap.containsKey(dep[0])){
                dependencyMap.get(dep[0]).add(dep[1]);
            } else {
                Set<Node> set = new HashSet<>();
                set.add(dep[1]);
                dependencyMap.put(dep[0], set);
            }
        }

        Set<Node> visited =  new HashSet<>();
        Set<Node> visiting =  new HashSet<>();
        Deque<Node> stack =  new ArrayDeque<>();

        for(Node n: nodes){
            if(!visited.contains(n)&& !visiting.contains(n)){
                stack.addLast(n);
                visited.add(n);
                for(Node preReq: dependencyMap.get(n)){
                    if(!visited.contains(n)&& !visiting.contains(n)){
                        stack.addLast(preReq);
                        visiting.add(preReq);
                    }
                }
            }

            while(!visiting.isEmpty()){
                Node n = stack.getLast();
                if()
            }
        }

    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            Node n = new Node(i);
            nodes.add(n);
            graph.addVertex(n);
        }

        graph.addEdge(nodes.get(0), nodes.get(2));
        graph.addEdge(nodes.get(1), nodes.get(2));
        graph.addEdge(nodes.get(1), nodes.get(3));
        graph.addEdge(nodes.get(2), nodes.get(4));
        graph.addEdge(nodes.get(2), nodes.get(5));
        graph.addEdge(nodes.get(3), nodes.get(4));
        graph.addEdge(nodes.get(3), nodes.get(6));
        graph.addEdge(nodes.get(4), nodes.get(5));
        graph.addEdge(nodes.get(4), nodes.get(6));
        graph.addEdge(nodes.get(7), nodes.get(8));

        graph.bfs();

        boolean b = graph.hasRoute(nodes.get(0), nodes.get(3));
        System.out.print("\n" + b);
        b = graph.hasRoute(nodes.get(0), nodes.get(8));
        System.out.print("\n" + b);
    }
}



/*

   1 --  2 -- 0
   /    /  \
  3 -- 4 -- 5
   \  /
    6

  8 -- 7
 */