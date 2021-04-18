package lesson119;

import java.io.Serializable;

public class Animal implements Serializable{
    private String name;
    private double weight;
    private String breed;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }
    public Animal(){
    }
    public static Animal getAnimal() {
        return new Animal();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public String getBreed() {
        return breed;
    }
}
