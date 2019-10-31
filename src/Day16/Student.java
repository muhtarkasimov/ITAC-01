package Day16;

class Student {
    int id;
    int age;
    String firstName;
    String secondName;
    String faculty;
    boolean isStillStudying = true;

    public void getHungry() {
        System.out.println("*Student " + firstName + " gets hungry*");
        System.out.println("Oh, I am " + firstName + " and I am hungry!");
        System.out.println("Give me something to eat, for example pizza, samsa or manty\n");
    }

    public void eat(String meal) {
        System.out.println("*Feeding " + firstName + " with " + meal + "*");
        if (meal.equals("samsa") ||
                meal.equals("pizza") ||
                meal.equals("manty")) {
            System.out.println("Mmmm, yummy, " + meal + " is so delicious\n*Student gets happy*\n");
        } else {
            System.out.println("The " + meal + " is not even food, are you kidding me?\n*Student gets angry*\n");
        }
    }

    public void expelFromSchool() {
        System.out.println("*Expelling " + firstName + "*");
        System.out.println("Oh no, my parents are gonna kill me!\n");
        isStillStudying = false;
    }

    public void enroll(String lFirstName, String lSecondName, int lAge, int lId, String lFaculty) {
        firstName = lFirstName;
        secondName = lSecondName;
        age = lAge;
        id = lId;
        faculty = lFaculty;
        System.out.println("*Student " + firstName + " " + secondName + " is enrolled*\n");
    }

    public void showInfo() {
        System.out.println("id = " + id);
        System.out.println("firstName = " + firstName);
        System.out.println("secondName = " + secondName);
        System.out.println("age = " + age);
        System.out.println("faculty = " + faculty);
        System.out.println("isStillStudying = " + isStillStudying);
        System.out.println();

    }

}