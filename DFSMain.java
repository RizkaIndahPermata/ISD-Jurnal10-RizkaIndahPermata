public class DFSMain { 
    public static void main(String[] args) {
        DFSTraversal g = new DFSTraversal(9);

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(1, 4);
        g.addEdge(3, 6);
        g.addEdge(4, 5);
        g.addEdge(4, 7);
        g.addEdge(6, 7);
        g.addEdge(5, 7);
        g.addEdge(5, 2);
        g.addEdge(7, 8);
        g.addEdge(2, 1);
        g.addEdge(8, 5);

        System.out.println("DFS untuk graf (mulai dari A):");
        g.dfs(0);
    }
}
