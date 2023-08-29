package data.brick;

import data.component.Vertex;

/**
 * merupakan class yang membungkus angka dengan value yang telah ditentukan.
 * tiap value pada class akan mengembalikan nilai integer, bukan string
 */
public class Transmisi extends Vertex {
    public enum TransmisiEnum {
        AUTO,
        MANUAL
    }
    public TransmisiEnum transmisi;
    public Transmisi(TransmisiEnum transimisi) {
        this.transmisi = transimisi;
    }
    @Override
    public String getValue() {
        return transmisi.toString();
    }
}
