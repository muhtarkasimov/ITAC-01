package Day28.HW28_1;

public abstract class NaseleniyPunkt {
    private int naselenie;
    private String name;
    private String rukovoditel;
    static private NaseleniyPunkt[] naseleniyPunkts = new NaseleniyPunkt[1000];

    public NaseleniyPunkt(int naselenie, String name, String rukovoditel) {
        this.naselenie = naselenie;
        this.name = name;
        this.rukovoditel = rukovoditel;
        for (int i = 0; i < naseleniyPunkts.length; i++) {
            if (naseleniyPunkts[i] == null) {
                naseleniyPunkts[i] = this;
            }
        }
    }

    public int getNaselenie() {
        return naselenie;
    }

    public void setNaselenie(int naselenie) {
        this.naselenie = naselenie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRukovoditel() {
        return rukovoditel;
    }

    public void setRukovoditel(String rukovoditel) {
        this.rukovoditel = rukovoditel;
    }

    public String getPunktNameByRukovoditel(String rukovoditel) {
        for (int i = 0; i < naseleniyPunkts.length; i++) {
            if (naseleniyPunkts[i].getRukovoditel() == rukovoditel) {
                return naseleniyPunkts[i].toString();
            }
        }
        return "Nothing found";
    }

    @Override
    public String toString() {
        return "NasPunkt name: " + this.getName() + "\n Naselenie: " + this.getNaselenie();
    }
}
