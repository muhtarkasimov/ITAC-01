package Day21.HW21_2;

public class HW21_2 {

    public static void main(String[] args) {

        Food food1 = new Food("Samsa", 35, 100);
        Food food2 = new Food("Manty", 150, 300);
        Food food3 = new Food("Oromo", 120, 250);

        Drink drink1 = new Drink("Cola", 45, 1000);
        Drink drink2 = new Drink("Sprite", 28, 500);
        Drink drink3 = new Drink("Fanta", 60, 1500);


        Food[] foods = {food1, food2, food3};
        Drink[] drinks = {drink1, drink2, drink3};
        FoodStuff[] ordred = {drink1};

        Menu menu = new Menu(foods, drinks, ordred, 1.15);


        Time time = new Time(1,1,1,2000,23,0,0);
        System.out.println(time);
        //problems with sout(time) /05.11 3:41
        //moving date var into toString (int Time class)
        //no problems with time /05.11 4:08

        Person man = new Person("Mukhtar Kasimov",21,"male");
        Person man2 = new Person("Kasim Mukhtarov",12,"male");
        Person man3 = new Person("Mukhsim Katarov",35,"male");

//        Furniture f1 = new Furniture();

        Person[] staff = {man,man2,man3};

        man.sleep(10,time);

        System.out.println(time);

        man.eat(food1);

        Cafe cafe = new Cafe("Sierra",9,23,menu,staff);
        menu.addToOrdered(food1);

        System.out.println(menu.getCheck());



    }
}
