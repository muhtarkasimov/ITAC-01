package Day31.HW31_1;

public class Turtle implements SelectAnimal {

    private String name;
    private int age;
    private double weight;

    @Override
    public void selectEqualOrGreaterByWeight(double weight) {
        if (this.weight >= weight) {
            System.out.println("Selected Turtle with name " + name + " by weight");
        }
    }

    @Override
    public void selectEqualOrGreaterByAge(int age) {
        if (this.age >= age) {
            System.out.println("Selected Turtle with name " + name + " by age");
        }
    }
}
