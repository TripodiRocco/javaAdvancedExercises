package javaadvanced._9;

public class Car implements Movable {

    @Override
    public String moveForward() {
        return "As a car I can move forward";
    }

    @Override
    public String moveBackward() {
        return "As a car I can move backward";
    }
}
