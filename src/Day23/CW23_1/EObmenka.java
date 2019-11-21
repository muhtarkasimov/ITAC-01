package Day23.CW23_1;

public class EObmenka extends Obmenka {

    double percent = 0.02;

    public EObmenka(double percent) {
        this.percent = percent;
    }

    public EObmenka(String name) {
        super(name);
//        this.percent = percent;
    }

    @Override
    public double change(int sum, int operation, int currency) {
        double result = 0;


        // каждый раз будет снижать/увеличивать курс
        // добавить отдельный variable rate, и один раз присвоить сниженный курс
        if (operation == 1) { //buy
            kursy[1][currency] = kursy[1][currency] * 1.02;
        } else { //sell
            kursy[0][currency] = kursy[0][currency] * 0.98;
        }

        result = sum * super.kursy[currency][operation];
        return result;


    }

}