package _8;

public class Dog extends Animal{
    private String breed;
    private double speed;

    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
        this.speed=speed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
  public static Object runSpeedMetersPerSecond(Dog dog){
     double  result= dog.getHeight()*2;
      System.out.println("the Dog's Height * 2 is "+result);
     return result;
   }
   @Override
    public void print(){
       System.out.println(this.height+" "+this.weight+" "+this.getBreed());
   }
}

