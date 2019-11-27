package Day28.HW28_1;

import javax.swing.table.TableRowSorter;

public class Gorod extends NaseleniyPunkt {

    private Rayon[] rayons;

    public Gorod(int naselenie, String name, String rukovoditel, Rayon[] rayons) {
        super(naselenie, name, rukovoditel);
        this.rayons = rayons;
    }

    public Gorod(int naselenie, String name, String rukovoditel) {
        super(naselenie, name, rukovoditel);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
