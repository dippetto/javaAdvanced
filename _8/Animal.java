package _8;

class Animal {
    protected double height, weight, speed;
    protected String animalType;

    public Animal(double height, double weight,String animalType) {
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.animalType=animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getSpeed() {
        return speed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println(this.height + " " + this.weight);
    }
}
