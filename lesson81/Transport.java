package lesson81;

public class Transport {
    public static void main(String[] args) {
      String  type;
        int size;
Car myCar = new Car("Bogdan",120);
myCar.volume =120;
Car myCar2 = new Car();
        System.out.println(myCar2.model+""+myCar2.volume);
        myCar.display();
        myCar2.display();
        Bus b = new Bus();
    }


    private  void engine(){
        System.out.println("Lanos");
    }
    static void wheels (){
        System.out.println("Lada");
    }
}
