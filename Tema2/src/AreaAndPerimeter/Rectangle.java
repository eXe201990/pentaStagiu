package AreaAndPerimeter;

public class Rectangle  extends Shape implements  AreaAndPerimeter{

    public Rectangle(double a, double b){
        perimeter = 2 * a + 2 * b;
        area = a * b;
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
