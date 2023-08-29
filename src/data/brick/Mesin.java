package data.brick;

import data.component.Vertex;

/**
 * class yang menyimpan nilai dari mesin seperti volume CC, dan tipe transmisi
 */
public class Mesin extends Vertex {
    public final int cc;
    public Mesin(int cc) {
        this.cc = cc;
    }

    @Override
    public String getValue() {
        return String.valueOf(cc);
    }
}
