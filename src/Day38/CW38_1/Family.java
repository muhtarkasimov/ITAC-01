package Day38.CW38_1;

import java.util.List;

public class Family {

    private List<Person> family;
    private double familyCosts;

    public Family(List<Person> family) {
        this.family = family;
    }

    public List<Person> getFamily() {
        return family;
    }

    public void setFamily(List<Person> family) {
        this.family = family;
    }

    public double getFamilyCosts() {
        return familyCosts;
    }

    public void setFamilyCosts(double familyCosts) {
        this.familyCosts = familyCosts;
    }
}
