package _8;

public class Dog extends Animal{
    private String breed;
    private double speed;
    private String animalType="Dog";

    public Dog(double height, double weight, String breed,String animalType) {
        super(height, weight,animalType);
        this.breed = breed;
        this.speed=speed;
        this.animalType=animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
  public static double runSpeedMetersPerSecond(Dog dog){
     double  result= dog.getHeight()*2;
      dog.speed=result;
     return result;
   }


    @Override
    public void print(){
       System.out.println(this.height+" "+this.weight+" "+this.getBreed());
   }
}

