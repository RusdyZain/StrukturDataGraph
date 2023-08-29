package data.component;

import java.util.concurrent.atomic.AtomicReference;

public class Graph {
    public Vertex root;

    // Main lists
    DoubleLinkedListVertex propsLists = new DoubleLinkedListVertex();
    private DoubleLinkedListVertex visitedList =  new DoubleLinkedListVertex();
    private DoubleLinkedListVertex queueList = new DoubleLinkedListVertex();
    private DoubleLinkedListVertex resultList = new DoubleLinkedListVertex();
    public Graph(Vertex root) {
        this.root = root;
        System.out.println("graph dengan root : " + root.getValue());
    }
    void resetVisitedListAndQueueList() {
        visitedList = new DoubleLinkedListVertex();
        queueList = new DoubleLinkedListVertex();
    }
    void resetResult() {
        resultList = new DoubleLinkedListVertex();
    }

    // berfungsi untuk mencari vertex yang terdapat pada graph
    public Vertex getVertex(String tipeDataInString, String value) {
        tipeDataInString = tipeDataInString.toLowerCase();
        value = value.toLowerCase();
        resetVisitedListAndQueueList();
        queueList.add(root);
        Vertex current;
        while (!queueList.isEmpty()) {
            current = queueList.removeBack();
            //cek jika vertex tersebut telah dicari
            if(visitedList.peek(current) != null) continue;
            visitedList.add(current);
            if(current.getClass().getSimpleName().equalsIgnoreCase(tipeDataInString)) {
                if(current.getValue().equalsIgnoreCase(value)) {
                    return current;
                }
            }

            current.forEach(item -> {
                queueList.add(item);
            });
        }
        return null;
    }

    public void printBFS() {
        resetVisitedListAndQueueList();
        Vertex current;
        queueList.add(root);
        while (!queueList.isEmpty()) {
            current = queueList.removeBack();
            if(visitedList.peek(current) != null) continue;
            visitedList.add(current);
            // do something
            System.out.println(current.getClass().getSimpleName()+" : " + current.getValue());
            current.forEach(item -> {
                queueList.add(item);
            });
        }
    }
}
