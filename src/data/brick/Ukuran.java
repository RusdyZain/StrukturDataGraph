package data.brick;

import data.component.Vertex;

/**
 * merupakan class yang membungkus angka dengan value yang telah ditentukan.
 * class ini digunakan dalam mengelompokkan ukuran dari motor yang dimiliki
 * tiap value pada class akan mengembalikan nilai integer, bukan string
 */
public class Ukuran extends Vertex {
    public enum Size {
        KECIL,
        SEDANG,
        BESAR
    }

    public Size size;

    public Ukuran(Size size) {
        this.size = size;
    }

    @Override
    public String getValue() {
        return size.toString();
    }
}
