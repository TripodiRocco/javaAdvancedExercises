package javaadvanced._9;

abstract class Instrument implements Playable {
     String name;
     String brand;

     public Instrument(String name, String brand) {
          this.name = name;
          this.brand = brand;
     }
}
