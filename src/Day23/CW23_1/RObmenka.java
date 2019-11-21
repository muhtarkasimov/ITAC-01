package Day23.CW23_1;

public class RObmenka extends Obmenka {

    public RObmenka() {
    }

    public RObmenka(String name) {
        super(name);
    }

    @Override
    public double change(int sum, int operation, int currency) {

        return sum * super.kursy[currency][operation];
    }
}
