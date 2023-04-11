package _8;

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
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    public static Object printDog(Dog dog){
        System.out.println(dog.getBreed());
        System.out.println("Height "+dog.getHeight());
        System.out.println("Weight "+dog.getWeight());
        System.out.println("\n");
        return dog;
    }
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog dog1= new Dog(2.0d,6d,"Pastore abbruzzese");
        Dog dog2= new Dog(9.0d,3d,"O'frat");
        printDog(dog1);
        printDog(dog2);

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    public static Object printBird(Bird bird){
        System.out.println("What a bird!");
        System.out.println("Height "+bird.getHeight());
        System.out.println("Weight "+bird.getWeight());
        System.out.println("Wind span "+bird.getWingSpan());
        System.out.println("\n");
        return bird;
    }
    public static Object printFish(Fish fish){
        System.out.println("What a fish!");
        System.out.println("Height "+fish.getHeight());
        System.out.println("Weight "+fish.getWeight());
        System.out.println("Species= "+fish.getSpecies());
        System.out.println("\n");
        return fish;
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Bird bird1=new Bird(3d,5d,2d);
        Fish fish1=new Fish(2d,3d,"Padulo");
        printBird(bird1);
        printFish(fish1);
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog dog1= new Dog(2.0d,6d,"Pastore abbruzzese");
        runSpeedMetersPerSecond(dog1);
        Fish fish1=new Fish(2d,3d,"Padulo");
        swimSpeedMetersPerSecond(fish1);
        Bird bird1=new Bird(3d,5d,2d);
        flySpeedMetersPerSecond(bird1);

    }
}
