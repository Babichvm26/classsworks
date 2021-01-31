package lesson81;

public class Car extends  Transport {
    double volume;
    String model;

    Car(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }


    Car() {

    }

    void display() {
        System.out.println(this.model);
    }
//@Override
     //   void wheels () {
       //     System.out.println("Porshe");



}

