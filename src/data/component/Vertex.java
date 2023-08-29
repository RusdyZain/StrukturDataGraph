package data.component;

import javax.management.BadAttributeValueExpException;

public class Vertex {
    public interface Consumer {
        void call(Vertex item);
    }
    DoubleLinkedList<Edge> edges = new DoubleLinkedList<>();
    public String getValue() {
        return "vertex";
    }
    public void connectVertexUnique(Vertex targetVertex) {
        //cek jika pengguna memiliki lebih dari satu jenis
        edges.resetPosToHead();
        while (edges.isInList()) {
            if(edges.peek().getFrom(this) == targetVertex) {
                return;
            }
            edges.advanceNext();
        }
        Edge join = new Edge(this, targetVertex);
        edges.add(join);
        targetVertex.edges.add(join);
    }
    // perulangan yang memanggil semua vertex dari edges
    public void forEach(Consumer value) {
        edges.forEach(item-> {
            value.call(item.getFrom(this));
        });
    }
    public void printSurface() {
        forEach(item -> {
            System.out.println(item.getClass().getSimpleName() + " : " + item.getValue());
        });
    }
    public void validateVertexConnection() {
    }
}
