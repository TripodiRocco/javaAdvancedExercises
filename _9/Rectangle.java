package javaadvanced._9;

public class Rectangle extends Shape {

    public Rectangle(double height, double width) {
        super(height, width);
    }


    public double calculateArea(){
        double areaFigureGeometriche = getHeight() * getWidth();
        return areaFigureGeometriche;
    }
}
