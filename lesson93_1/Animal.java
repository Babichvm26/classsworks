package lesson93_1;

import java.util.Comparator;

public class Animal implements Comparable {
    String species;
    int weight;
    String name;
    int height;

    public Animal(String species, int weight, String name, int height) {
        this.species = species;
        this.weight = weight;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species +
                ", weight=" + weight + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }


    /*       @Override
            public boolean equals(Object o) {
                boolean result;
                if (this.species.equals(((Animal) o).species) == true) {
                    if (this.species == ((Animal) o).species) {

                        result = true;

                    } else {
                        result = false;


                    }
                } else {
                    result = false;
                }
                return result;
            }

    */
    @Override
    public int compareTo(Object o) {
        int result = 0;
//        String st1 = this.species;
//        String st2 = ((Animal) o).species;
//        if (st1 == st2) {
//        if (st1.equals(st2)) {
//        if (this.species == ((Animal) o).species) {
        if (this.species.equals(((Animal) o).species)) {
            result = 1;
        } else
//        if (st1 != st2) {
          if (this.species != ((Animal) o).species) {
            result = -1;
        } else {
            result = 0;
            //сюда можно дописать сортировку по 2 и 3 полю и тд

            if (this.weight > ((Animal) o).weight) {
                result = 1;
            } else if (this.weight < ((Animal) o).weight) {
                result = -1;
            } else {
                result = 0;
            }

        }
        return result;
    }
/*
     new Animal("Сарна європейська", 30, "Боба", 2),
                new Animal("Сарна європейська", 30, "Боба", 2),
                new Animal("Персидский кот ", 6, "Лорд", 1),
                new Animal("Сарна європейська", 30, "Боба", 2),
                new Animal("Персидский кот", 6, "Лорд", 1),
                new Animal("Сарна європейська", 30, "Персик", 2),
                new Animal("Сарна європейська", 30, "Персик", 1),
                new Animal("Сарна європейська", 30, "Персик", 2),
                new Animal("Сарна європейська", 25, "Персик", 2),
                new Animal("Сарна європейська", 28, "Кокос", 1)};
*/


    /*
  //  @Override
  //  public int compareTo(Object o) {
        System.out.println(((Animal) o).species);
    int result = 0;
            if (this.weight > ((Animal) o).weight) {
                result = 1;
            } else if (this.weight < ((Animal) o).weight) {
                result = -1;
            } else {
                result = 0;
                //сюда можно дописать сортировку по 2 и 3 полю и тд

            }
            return result;
        }

/*
         class SortBySpecies implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Animal) o1).species.compareTo(((Animal) o2).species);
            }
        }

 */
    }

