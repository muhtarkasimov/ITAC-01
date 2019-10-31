package Day19.HW19_1;

public class HW19_1 {


    public static void main(String[] args) {

        //f1
        Sheep sheep1 = new Sheep(100, 10, "male", "Shoppie");
        Sheep sheep2 = new Sheep(195, 8, "female", "Poppie");
        Sheep sheep3 = new Sheep(190, 9, "female", "Sheepie");
        Sheep[] sheeps1 = {sheep1, sheep2, sheep3};
        Cow cow1 = new Cow(200, 20, "male", "Cowwie");
        Cow cow2 = new Cow(195, 19, "male", "Miranda");
        Cow cow3 = new Cow(190, 18, "female", "Maui");
        Cow cow4 = new Cow(185, 17, "female", "Pepsi");
        Cow cow5 = new Cow(180, 16, "male", "Drakula");
        Cow[] cows1 = {cow1, cow2, cow3, cow4, cow5};
        Horse horse1 = new Horse(150, 15, "male", "Chappie", "Black");
        Horse horse2 = new Horse(155, 14, "male", "Makaka", "Brown");
        Horse[] horses1 = {horse1, horse2};

        //f2
        Sheep sheep21 = new Sheep(99, 99, "transgender", "Shpak");
        Sheep[] sheeps2 = {sheep21};
        Cow cow21 = new Cow(999, 1, "alien", "Hulk");
        Cow[] cows2 = {cow21};
        Horse horse21 = new Horse(1, 1, "atom", "Proton", "Transparent");
        Horse[] horses2 = {horse21};

        Farm farm1 = new Farm("Kochkor", cows1, sheeps1, horses1, "Almazbek Atambaev");
        Farm farm2 = new Farm("Osh", cows2, sheeps2, horses2, "Bakiev");

        farm1.printInfo();
        farm2.printInfo();
    }
}
