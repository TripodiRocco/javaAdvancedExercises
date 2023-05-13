package javaadvanced._9;

public class Piano extends Instrument {

    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "melodic sound";
    }
}
