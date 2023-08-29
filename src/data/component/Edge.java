package data.component;

/**
 * edges penghubung vertex
 * ingat untuk validasi tipe data dari item vertex menggunakan `instanceof` diikuti dengan Tipe Data seperti
 * class Motor, Mesin, UkuranBodi, Warna, dll.
 */
public class Edge {
    Vertex a;
    Vertex b;
    public Edge(Vertex a, Vertex b) {
        this.a = a;
        this.b = b;
    }
    public Vertex getFrom(Vertex thisVertex) {
        if(a == thisVertex) return b;
        if(b == thisVertex) return a;
        else return null;
    }
}
