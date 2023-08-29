package data.component;

import java.util.concurrent.atomic.AtomicReference;

public class DoubleLinkedListVertex extends DoubleLinkedList<Vertex> {
    public Vertex getVertex(String value) {
        AtomicReference<Vertex> res = new AtomicReference<>(null);
        forEach(item -> {
            if(peek().getValue().equalsIgnoreCase(value)) {
                res.set(peek());
                breakForEach();
            }
        });
        return res.get();
    }
}
