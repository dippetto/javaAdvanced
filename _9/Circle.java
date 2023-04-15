package _9;

public class Circle extends Shape {
    public Circle(double height, double width) {
        super(height, width);
        this.setWidth(height);
    }
    @Override
    double calculateArea() {
        double result= Math.PI * Math.pow((getHeight() / 2), 2);
        result=Math.floor(result);
        return result;
    }
}