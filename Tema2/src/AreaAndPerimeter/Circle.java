package AreaAndPerimeter;

public class Circle  extends Shape implements AreaAndPerimeter{

    public Circle(double radius){
        area = Math.PI * radius * radius;
        perimeter = Math.PI * radius * 2;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
