package javaadvanced._8;

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
    private static void exercise1() {
        System.out.println("\nExercise 1: ");

        Dog dog = new Dog(28.5, 9.8, "Beagle");
        System.out.println(dog.getBreed());
        System.out.println(dog.getHeight());
        System.out.println(dog.getWeight());
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
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        Fish fish = new Fish(12.6, 45, "Carpa Koi");
        System.out.println(fish.getSpecies());
        System.out.println(fish.getHeight());
        System.out.println(fish.getWeight());

        System.out.println();

        Bird bird = new Bird(1.71, 70, 1.20);
        System.out.println(bird.getWingSpan());
        System.out.println(bird.getHeight());
        System.out.println(bird.getWeight());
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

        Dog dog = new Dog(34.2, 15.5, "German Spitz");

        Fish fish = new Fish(3.50, 680, "White Shark");

        Bird bird = new Bird(45, 20, 10);

        if (dog.runSpeedMetersPerSecond() < fish.swimSpeedMetersPerSecond()) {
            System.out.println("The animal with the fastest movement is Fish with: " + fish.swimSpeedMetersPerSecond() + " meters per second");
        } else if (fish.swimSpeedMetersPerSecond() < bird.flySpeedMetersPerSecond()) {
            System.out.println("The animal with the fastest movement is Bird with: " + bird.flySpeedMetersPerSecond() + " meters per second");
        } else if (dog.runSpeedMetersPerSecond() > bird.flySpeedMetersPerSecond()) {
            System.out.println("The animal with the fastest movement is Bird with: " + dog.runSpeedMetersPerSecond() + " meters per second");
        }
    }

    }
