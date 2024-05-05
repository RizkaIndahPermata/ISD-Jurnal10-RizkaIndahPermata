import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal { 
    private int nodes;
    private LinkedList<Integer>adj[];
    private Queue<Integer> vertexQueue;

    @SuppressWarnings("unchecked")
    public BFSTraversal (int vertex) {
        nodes = vertex;
        adj = new LinkedList[nodes];

        for (int i = 0; i < vertex; i++) {
            adj[i] = new LinkedList<>();
        }

        vertexQueue = new LinkedList<Integer>();
    }

    public void insertEdge (int source, int dest) {
        adj[source].add(dest);
    }
    
    public void getAdj() {
        for (LinkedList<Integer> linkedlist : adj) {
            System.out.println(linkedlist);
        }
    }

    public String numToAlphabet (int i) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        return alphabet[i];
    }

    public void bfs (int sumber) {
        boolean traversalOrder[] = new boolean[nodes];
        int vertexDikunjungi = 0;
        traversalOrder[sumber] = true;
        vertexQueue.add(sumber);

        while (!vertexQueue.isEmpty()) {
            vertexDikunjungi = vertexQueue.poll();
            System.out.print(numToAlphabet(vertexDikunjungi) + " ");

            for (int tetangga : adj[vertexDikunjungi]) {
                if (!traversalOrder[tetangga]) {
                    traversalOrder[tetangga] = true;
                    vertexQueue.add(tetangga);
                }
            }
        }
    }
}