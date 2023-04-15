package _9;

public class Rectangle extends Shape{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double calculateArea() {
      double  result= getWidth()*getHeight();
      result=Math.floor(result);
      return result;
    }
}