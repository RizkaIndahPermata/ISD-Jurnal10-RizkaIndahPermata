import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSTraversal { 
    private int verteks;
    private LinkedList<Integer> adj[];
    private boolean visited[];

    @SuppressWarnings("unchecked")
    public DFSTraversal (int v) {
        verteks = v;
        adj = new LinkedList[verteks];
        for (int i = 0; i < v; i++) 
            adj[i] = new LinkedList<Integer>();

        visited = new boolean[verteks];
        for (int i = 0; i < verteks; i++) {
            visited[i] = false;
        }
    }

    public void addEdge (int source, int dest) {
        adj[source].add(dest);
    }

    public String numToAlphabet (int i) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        return alphabet[i];
    }

    public void dfs (int sourceVertex) {
        Stack<Integer> stack = new Stack<>();
        stack.push(sourceVertex);

        while (stack.empty() == false) {
            sourceVertex = stack.peek();
            stack.pop();

            if (visited[sourceVertex] == false) {
                System.out.print(numToAlphabet(sourceVertex) + " ");
                visited[sourceVertex] = true;
            }

            Iterator<Integer> itr = adj[sourceVertex].iterator();

            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited[v]) 
                    stack.push(v);
            }
        }
    }
}
