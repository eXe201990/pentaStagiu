package AreaAndPerimeter;

public class Triangle extends Shape implements  AreaAndPerimeter  {

  public Triangle(double a, double b, double c){
      perimeter = a + b + c;
      area = Math.sqrt(perimeter*(perimeter - a)*(perimeter -b)*(perimeter -c));
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
