package _8;

public class Fish extends Animal{
    private String species;
    private double speed;
    private String animalType="Fish";

    public Fish(double height, double weight, String species,String animalType) {
        super(height, weight,animalType);
        this.species = species;
        this.speed=speed;
        this.animalType=animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public static double swimSpeedMetersPerSecond(Fish fish){
        double  result= fish.getWeight()*2;
        fish.speed=result;
        return result;
    }


    @Override
    public void print(){
        System.out.println(this.height+" "+this.weight+" "+this.species);
    }
}
