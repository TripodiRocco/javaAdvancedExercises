package javaadvanced._8;

public class Fish extends Animal {

    private String species;

    public Fish(double height, double weight) {
        super(height, weight);
    }

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double swimSpeedMetersPerSecond(){
        double fishWeight = getWeight() * 2;
        return fishWeight;
    }
}
