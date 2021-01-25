package lesson78;

public class Dog {
    int weight;
    String name;

    @Override
    public String toString() {
        return "Dog{"+
                "weigh=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog (int weigh, String name){

        this.weight = weight;
        this.name = name;



    }
    @Override
    public boolean equals(Object obj){
        return  this.weight == ((Dog) obj).weight;
    }

    @Override
    public int hashCode(){


        return weight+4+this.name.charAt(1);
    }
}
