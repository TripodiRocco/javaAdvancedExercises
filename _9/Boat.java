package javaadvanced._9;

public class Boat implements Movable {

    @Override
    public String moveForward() {
        return "As a boat I can move forward";
    }

    @Override
    public String moveBackward() {
        return "As a boat I can move also backward";
    }
}
