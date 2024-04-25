import java.util.*;

public class AdjacencyList {
    int V;
    LinkedList<Character> adjListArray[];
    AdjacencyList(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
    private int charToIndex(char c) {
        return c - 'A';
    }
    public void addEdge(char src, char dest) {
        int srcIndex = charToIndex(src);
        adjListArray[srcIndex].add(dest);
    }
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + (char) ('A' + i) + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        AdjacencyList myList = new AdjacencyList(9);
        myList.addEdge('A', 'B');
        myList.addEdge('A', 'D');
        myList.addEdge('A', 'E');
        myList.addEdge('B', 'E');
        myList.addEdge('C', 'B');
        myList.addEdge('D', 'G');
        myList.addEdge('E', 'F');
        myList.addEdge('E', 'H');
        myList.addEdge('F', 'H');
        myList.addEdge('F', 'C');
        myList.addEdge('G', 'H');
        myList.addEdge('H', 'I');
        myList.addEdge('I', 'F');
        myList.printGraph();
    }
}