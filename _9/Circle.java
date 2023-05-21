package javaadvanced._9;

public class Circle extends Shape{

    public Circle(double height, double width) {
        super(height, width);
    }

    public double calculateArea(){
        double areaFigureGeometriche = Math.PI * Math.pow((getHeight() / 2), 2);
        return areaFigureGeometriche;
    }
}
