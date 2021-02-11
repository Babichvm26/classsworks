package lesson93_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//
  Animal a0 = new Animal("Сарна європейська",6,"Боба",2);
  Animal a1 = new Animal("Персидский кот", 6, "Лорд", 1);
  Animal a2 = new Animal("Сарна європейська", 30, "Боба", 2);
  Animal a3 = new Animal("Персидский кот", 2, "Лорд", 1);
  Animal a4 = new Animal("Сарна європейська", 30, "Персик", 2);
  Animal a5 = new Animal("Персидский кот", 3, "Барсик", 1);
  Animal a6 = new Animal("Сарна європейська", 30, "Персик", 2);
  Animal a7 = new Animal("Сарна європейська", 25, "Персик", 2);
  Animal a8 = new Animal("Сарна європейська", 28, "Кокос", 1);
  Animal a9 = new Animal("Сарна європейська", 28, "Кокос", 1);
//
    Animal[] a = {a0,a1,a2,a3,a4,a5,a6,a7,a8,a9};
        Arrays.sort(a);
        for (Animal temp : a){
        System.out.println(temp);
    }
  }
}
