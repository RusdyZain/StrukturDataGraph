package data.brick;

import data.component.Vertex;

public class Warna extends Vertex {

    public enum Color{
        HITAM,
        PUTIH,
        MERAH,
        BIRU
    }
    Color color;
    public Warna( Color color) {
        this.color = color;
    }

    @Override
    public String getValue() {
        return color.toString();
    }
}
