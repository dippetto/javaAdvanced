package _8;

public class Dog extends Animal{
    private String breed;

    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
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
}

