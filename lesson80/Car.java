package lesson80;

public class Car extends  Transport {
     double volume ;
     String model ;

    @Override
    public String toString() {
        return "Car{"+
                "volume=" + volume +
                ", model='" + model + '\'' +
                '}';
    }

    public Car (int volume, String model){

        this.volume = volume;
        this.model = model;



    }
    @Override
    public boolean equals(Object obj){
        return  this.volume == ((Car) obj).volume;
    }

    @Override
    public int hashCode(){


        return (int) (volume+5+this.model.charAt(1));
    }
}








