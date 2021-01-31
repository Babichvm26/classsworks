package lesson80;

public class Transport {
    public static void main(String[] args) {
        String type = "Passenger";
        int size = 16;

        Object o = new Object();
        int hCode = o.hashCode();
        System.out.println(hCode);

        Car c1 = new Car(120, "Mitsubisi");
         Car c2 = new Car(120, "Mitsubisi");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
