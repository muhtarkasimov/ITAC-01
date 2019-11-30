package Day31.HW31_1;

import java.util.Random;

public class HW31_1 {

    public static void main(String[] args) {

        SelectAnimal[] animals = initAnimalsArray(100,1,20,50,500);


//        // selecting by
//        for (SelectAnimal sa : animals) {
//            if (sa instanceof Shark && ((Shark)sa).getAge() > 10) {
//                System.out.println(((Shark) sa).getName() + " is shark and he is over than 10 years old)");
//            }
//        }

        //checking if array is filled correctly:
        int counter = 0;
        for (SelectAnimal sa : animals) {
            counter++;
            System.out.println(counter + ".--------------------------\n" + sa);
            if (sa instanceof Turtle) {
                System.out.println(((Turtle) sa).getName() + "  -name");
                System.out.println(((Turtle) sa).getAge() + "  -age");
            } else if (sa instanceof Shark) {
                System.out.println(((Shark) sa).getName() + "  -name");
                System.out.println(((Shark) sa).getAge() + "  -age");
            } else if (sa instanceof Duck) {
                System.out.println(((Duck) sa).getName() + "  -name");
                System.out.println(((Duck) sa).getAge() + "  -age");
            }
            System.out.println();
        }

    }

    public static SelectAnimal[] initAnimalsArray(int size,
                                                  int ageMinBound,
                                                  int ageMaxBound,
                                                  int weightMinBound,
                                                  int weightMaxBound) {
        SelectAnimal[] animals = new SelectAnimal[size];
        Random random = new Random();
        for (int i = 0; i < animals.length ; i++) {
            //random vars
            String randomName = "" +  (char)random.nextInt((122 - 97 + 1) + 97) + (char)random.nextInt((122 - 97 + 1) + 97);
            int randomAge = random.nextInt((ageMaxBound - ageMinBound + 1) + ageMinBound);
            int randomWeight = random.nextInt((weightMaxBound - weightMinBound + 1) + weightMinBound);

            switch (random.nextInt(3)) {
                case 0: animals[i] = new Turtle(randomName,randomAge,randomWeight); break;
                case 1: animals[i] = new Shark(randomName,randomAge,randomWeight); break;
                case 2: animals[i] = new Duck(randomName,randomAge,randomWeight); break;
            }
        }

        return animals;
    }
}
