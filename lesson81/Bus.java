package lesson81;

public class Bus extends  Transport {
    int passengers;
    String model;
    double price;

    Bus(int passengers, String model) {
        this(passengers, model, 0);
        System.out.println("3 constr");

    }

    Bus(int passengers, String model, double price) {
        this.passengers = passengers;
        this.model = model;
        this.price = price;
        System.out.println("4 constr");


    }

    Bus() {
        this(0);
        System.out.println("1 constr");
    }

    Bus(int passengers) {
        this(passengers, "Bogdan");
        System.out.println("2 constr");
    }




//@Override
     void engine() {
        System.out.println("Shkoda");
    }
}