package Day10;

import java.util.*;
public class CW10_calorieCalc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int age;        // in years
    int gender;     // 1 - male, 2 - female
    int weight;     // in kg
    int height;     // in cm
    int activities;
    /*  1. no activities
    *   2. small activities
    *   3. normal activities
    *   4. many activities
    *   5. athletic activities
    * */

        boolean allIsOk = false;
        System.out.println("Welcome to Calorie Calculator");
        do {
            System.out.println("Enter age (1 - 120): ");
            age = scan.nextInt();

            System.out.println("Choose gender (1 - male, 2 - female): ");
            gender = scan.nextInt();

            System.out.println("Enter weight (10 - 1000): ");
            weight = scan.nextInt();

            System.out.println("Enter height (100 - 250): ");
            height = scan.nextInt();

            System.out.println("Enter activities level: "
                    + "\n1 - No activities"
                    + "\n2 - Small activities"
                    + "\n3 - Normal activities"
                    + "\n4 - Many activities"
                    + "\n5 - Athletic activities");
            activities = scan.nextInt();

            // Validating input values
            if (age > 0 && age < 121 &&
                    gender > 0 && gender < 3 &&
                    weight > 9 && weight < 1001 &&
                    height > 99 && height < 251 &&
                    activities > 0 && activities < 6)
            {
                allIsOk = true;
            } else {
                System.out.println("Oops! Some input values are invalid, please review your input and reernter it. Thanks)");
            }
        } while (!allIsOk);


        System.out.printf("Your calorie consumption must be %.2f kcalories per day.\n",getCalories(age, gender, weight, height, activities));
        System.out.println("If you want weight loss, then: ");
        System.out.printf("Your calorie consumption must be %.2f kcalories per day.\n",getCalories(age, gender, weight, height, activities)*0.78);

    }

    static double getCalories(int age, int gender, double weight, double height, int activities){
        double calories;

//        For men:
//        BMR = 10W + 6.25H - 5A + 5
//        For women:
//        BMR = 10W + 6.25H - 5A - 161
//        Then multiply it by ACT
//
//        BMR - Calories
//        W - weight
//        H - height
//        A - age
//        ACT - activities

        //calculating calories
        calories = (10.0 * weight) + (6.25 * height) - (5.0 * age);

        //correction by gender
        calories += (gender == 1) ? (+5) : (-161);

        //correcting by activities
        switch (activities) {
            case 1: calories *= 1.00; break;
            case 2: calories *= 1.25; break;
            case 3: calories *= 1.50; break;
            case 4: calories *= 1.75; break;
            case 5: calories *= 1.95; break;
        }
        return calories;
    }
}
