public class BFSMain { 
    public static void main(String[] args) {
        BFSTraversal graf = new BFSTraversal(10);

        graf.insertEdge(0, 1);
        graf.insertEdge(0, 3);
        graf.insertEdge(0, 4);
        graf.insertEdge(1, 4);
        graf.insertEdge(3, 6);
        graf.insertEdge(4, 5);
        graf.insertEdge(4, 7);
        graf.insertEdge(6, 7);
        graf.insertEdge(5, 7);
        graf.insertEdge(5, 2);
        graf.insertEdge(7, 8);
        graf.insertEdge(2, 1);
        graf.insertEdge(8, 5);

        System.out.println("BFS untuk graf (mulai dari A):");
        graf.bfs(0);
    }
}
