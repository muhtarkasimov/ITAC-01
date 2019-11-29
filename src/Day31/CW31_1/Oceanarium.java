package Day31.CW31_1;

public class Oceanarium {

    private int size;
    private Swimable[] swimables = new Swimable[14];

    public Oceanarium(int size) {
        swimables = new Swimable[size];
    }

    public Swimable[] getSwimables() {
        return swimables;
    }

    public void setSwimables(Swimable[] swimables) {
        this.swimables = swimables;
    }

    public void addSwimable(Swimable swimable) {
        for (int i = 0; i < swimables.length; i++) {
            if (swimables[i] == null) {
                swimables[i] = swimable;
                break;
            }
        }
    }
}
