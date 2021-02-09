package lesson93_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Сарна європейська", 20, "Боба", 2),
                new Animal("Сарна європейська", 15, "Боба", 2),
                new Animal("Персидский кот ", 16, "Лорд", 1),
                new Animal("Сарна європейська", 30, "Боба", 2),
                new Animal("Персидский кот", 6, "Лорд", 1),
                new Animal("Сарна європейська", 30, "Персик", 2),
                new Animal("Сарна європейська", 30, "Персик", 1),
                new Animal("Сарна європейська", 30, "Персик", 2),
                new Animal("Сарна європейська", 25, "Персик", 2),
                new Animal("Сарна європейська", 28, "Кокос", 1)};

        Arrays.sort(animals);
        for (Animal temp : animals) {
            System.out.println(temp);

        }
    }
}
