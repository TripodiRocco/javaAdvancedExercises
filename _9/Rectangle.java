package javaadvanced._9;

public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        this.height = a;
        this.width = b;
    }

    public double calculateArea(){
        double areaFigureGeometriche = getHeight() * getWidth();
        return areaFigureGeometriche;
    }
}
