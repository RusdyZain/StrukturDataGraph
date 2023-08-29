package data.brick;

import data.component.Vertex;

public class Motor extends Vertex {
    public String nama;
    public String deskripsi = "";
    public Motor(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }
    @Override
    public String getValue() {
        return nama;
    }
}
