package _8;

public class Bird extends Animal{
    private double wingSpan;
    private double speed;

    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
        this.speed=speed;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public static Object flySpeedMetersPerSecond(Bird bird){
        double  result= bird.getWingSpan()*4;
        System.out.println("the Bird's Wingspan * 4 is "+result);
        return result;
    }
    @Override
    public void print(){
        System.out.println(this.height+" "+this.weight+" "+this.wingSpan);
    }
}
