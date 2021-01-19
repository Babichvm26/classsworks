package lesson_70;

public class Main {
    public static void main(String[] args) {

        Bus Volga= new Bus();
        Volga.model = "Volga";
        System.out.println("Поле Volga.model ініціалізоване");
        Volga .maxSpeed = 120;
        System.out.println("Поле Volga.maxSpeed ініціалізоване");
        Volga.Weight = 1200;
        System.out.println("Поле  Volga.Weight ініціалізоване");

        Bus Moskvich = new Bus();
        Moskvich.model = "Moskvich";
        System.out.println("Поле  Moskvich.Weight ініціалізоване");
        Moskvich.maxSpeed = 100;
        System.out.println("Поле  Moskvich.Weight ініціалізоване");
        Moskvich.Weight = 1000;
        System.out.println("Поле  Moskvich.Weight ініціалізоване");


        System.out.println("Нестатичні поля");
        System.out.println(Volga.model +   "  " + Volga.maxSpeed);
        System.out.println(Moskvich.model +   "  " + Moskvich.maxSpeed);
        System.out.println("Статичне поле");
        System.out.println(Volga.Weight);
        System.out.println(Moskvich.Weight);
    }
}
