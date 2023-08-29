package data.brick;

import data.component.Vertex;

/**
 * sebuah class yang menyimpan informasi mengenai manufaktur dari motor yang dimiliki, seperti nama manufaktur
 * beserta deskripsi (optional)
 */
public class Manufaktur extends Vertex {
    public String nama;
    public Manufaktur(String nama) {
        this.nama = nama;
    }

    @Override
    public String getValue() {
        return nama;
    }
}
