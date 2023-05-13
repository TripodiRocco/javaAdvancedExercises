package javaadvanced._9;

public class Guitar extends Instrument {

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "Electric sound";
    }
}
