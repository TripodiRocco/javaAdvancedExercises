package javaadvanced._9;

public class Circle extends Shape{

    public Circle(double height) {
        this.height = height;
    }

    public double calculateArea(){
        double areaFigureGeometriche = Math.PI * Math.pow((getHeight() / 2), 2);
        return areaFigureGeometriche;
    }
}
