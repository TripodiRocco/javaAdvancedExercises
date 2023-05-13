package javaadvanced._8;

public class Dog extends Animal {

    String breed;

    public Dog(double height, double weight) {
        super(height, weight);
    }

    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Double runSpeedMetersPerSecond(){
        double dogHeight = getHeight() * 2;
        return dogHeight;
    }
}
