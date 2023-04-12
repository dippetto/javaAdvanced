package _8;

import java.util.ArrayList;
import java.util.List;

import static _8.Bird.flySpeedMetersPerSecond;
import static _8.Dog.runSpeedMetersPerSecond;
import static _8.Fish.swimSpeedMetersPerSecond;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    public static Object printDog(Dog dog) {
        System.out.println(dog.getBreed());
        System.out.println("Height " + dog.getHeight());
        System.out.println("Weight " + dog.getWeight());
        System.out.println("\n");
        return dog;
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog dog1 = new Dog(2.0d, 6d, "Pastore abbruzzese","Dog");
        Dog dog2 = new Dog(9.0d, 3d, "O'frat","Dog");
        printDog(dog1);
        printDog(dog2);

    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    public static void printBird(Bird bird) {
        System.out.println("What a bird!");
        System.out.println("Height " + bird.getHeight());
        System.out.println("Weight " + bird.getWeight());
        System.out.println("Wind span " + bird.getWingSpan());
        System.out.println("\n");

    }

    public static void printFish(Fish fish) {
        System.out.println("What a fish!");
        System.out.println("Height " + fish.getHeight());
        System.out.println("Weight " + fish.getWeight());
        System.out.println("Species= " + fish.getSpecies());
        System.out.println("\n");

    }

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Bird bird1 = new Bird(3d, 5d, 2d,"Bird");
        Fish fish1 = new Fish(2d, 3d, "Padulo","Fish");
        printBird(bird1);
        printFish(fish1);
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
//     private static double fasterAnimal(){
//        double faster=0;
//        if (flySpeedMetersPerSecond(bird1)>faster)
//    }
    private static void printAnimals(Animal animal) {
        System.out.println(animal.getHeight() + " " + " " + animal.getWeight());

    }

    private static void printAnimals(Dog dog) {
        System.out.println(dog.getWeight() + " " + dog.getHeight() + " " + dog.getBreed());
    }


    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog dog1 = new Dog(2.0d, 6d, "Pastore abbruzzese","Dog");
        System.out.println("the Dog's Height * 2 is "+runSpeedMetersPerSecond(dog1));
        Fish fish1 = new Fish(2d, 3d, "Padulo","Fish");
        System.out.println("the Fish's Weight * 2 is "+swimSpeedMetersPerSecond(fish1));
        Bird bird1 = new Bird(3d, 5d, 2d,"Bird");
        System.out.println("the Bird's Wingspan * 4 is "+flySpeedMetersPerSecond(bird1));
        List<Animal> speedList = new ArrayList<>();
        speedList.add(dog1);
        speedList.add(fish1);
        speedList.add(bird1);

        double maxSpeed=0d;
        for (Animal animale : speedList) {
            double currentAnimalSpeed=0;
            switch(animale.getAnimalType()){
                case "Dog"-> currentAnimalSpeed=runSpeedMetersPerSecond(dog1);
                case"Fish"-> currentAnimalSpeed=swimSpeedMetersPerSecond(fish1);
                case "Bird"-> currentAnimalSpeed=flySpeedMetersPerSecond(bird1);
            }

            if(currentAnimalSpeed>maxSpeed){
                maxSpeed=currentAnimalSpeed;
            }
        }
        System.out.println("The faster is going "+maxSpeed+"m/s");


    }

}
