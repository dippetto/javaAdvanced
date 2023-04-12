package _8;

public class Bird extends Animal{
    private double wingSpan;
    private double speed;
    private String animalType="Bird";

    public Bird(double height, double weight, double wingSpan,String animalType) {
        super(height, weight,animalType);
        this.wingSpan = wingSpan;
        this.speed=speed;
        this.animalType=animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public static double flySpeedMetersPerSecond(Bird bird){
        double  result= bird.getWingSpan()*4;
        bird.speed=result;
        return result;
    }

    @Override
    public void print(){
        System.out.println(this.height+" "+this.weight+" "+this.wingSpan);
    }
}
