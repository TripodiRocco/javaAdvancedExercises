package javaadvanced._8;

public class Bird extends Animal {

    private double wingSpan;

    public Bird(double height, double weight) {
        super(height, weight);
    }

    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double flySpeedMetersPerSecond(){
        double birdWingSpan = getWingSpan() * 2;
        return birdWingSpan;
    }

}
