package Day31.HW31_1;

public class Duck implements SelectAnimal {

    private String name;
    private int age;
    private double weight;

    @Override
    public void selectEqualOrGreaterByWeight(double weight) {
        if (this.weight >= weight) {
            System.out.println("Selected Duck with name " + name + " by weight");
        }
    }

    @Override
    public void selectEqualOrGreaterByAge(int age) {
        if (this.age >= age) {
            System.out.println("Selected Duck with name " + name + " by age");
        }
    }
}
