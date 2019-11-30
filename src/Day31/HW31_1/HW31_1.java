package Day31.HW31_1;

import java.util.Random;

public class HW31_1 {

    public static void main(String[] args) {

        SelectAnimal[] animals = initAnimalsArray(100,1,20,50,500);


        // selecting by
        for (SelectAnimal sa : animals) {
            if (sa instanceof Shark && ((Shark)sa).getAge() > 10) {
                System.out.println(((Shark) sa).getName() + " is shark and he is over than 10 years old)");
            }
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
                case 0: animals[i] = new Turtle(randomName,randomAge,randomWeight);
                case 1: animals[i] = new Shark(randomName,randomAge,randomWeight);
                case 2: animals[i] = new Duck(randomName,randomAge,randomWeight);
            }
        }


        return animals;
    }
}
