package AreaAndPerimeter;

public class Square  extends Shape implements  AreaAndPerimeter{

    public Square(double side){
        area = side * side;
        perimeter = 4 * side;
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
