package _8;

public class Fish extends Animal{
    private String species;

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public static Object swimSpeedMetersPerSecond(Fish fish){
        double  result= fish.getWeight()*2;
        System.out.println("the Fish's Weight * 2 is "+result);
        return result;
    }
}
