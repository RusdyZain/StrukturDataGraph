package data.brick;

import data.component.Vertex;

/**
 * class yang penyimpan nilai dari besar kapasitas tangki dan penyimpanan jok pada motor
 */
public class Kapasitas extends Vertex {
    public String tangkiInLiter;
    public Kapasitas(int tangkiInLiter) {
        this.tangkiInLiter = String.valueOf(tangkiInLiter);
    }

    @Override
    public String getValue() {
        return tangkiInLiter;
    }
}
