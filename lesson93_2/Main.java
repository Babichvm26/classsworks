package lesson93_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public   class Main {
    public static void main(String[] args) {
        String userInput;
        Scanner s = new Scanner(System.in);
        userInput = (String) s.nextLine();

        Animal a0 = new Animal("Сарна європейська", 6, "Боба", 2);
        Animal a1 = new Animal("Персидский кот", 6, "Лорд", 1);
        Animal a2 = new Animal("Сарна європейська", 30, "Боба", 2);
        Animal a3 = new Animal("Персидский кот", 2, "Лорд", 1);
        Animal a4 = new Animal("Сарна європейська", 30, "Персик", 2);
        Animal a5 = new Animal("Персидский кот", 3, "Барсик", 1);
        Animal a6 = new Animal("Сарна європейська", 30, "Персик", 2);
        Animal a7 = new Animal("Сарна європейська", 25, "Персик", 2);
        Animal a8 = new Animal("Сарна європейська", 28, "Кокос", 1);
        Animal a9 = new Animal("Сарна європейська", 28, "Кокос", 1);
        Animal[] a = {a0, a1, a2, a3, a4, a5, a6, a7, a8, a9};

            if (userInput.equals("2")) {
                Arrays.sort(a, new compareByWeight());
                for (Animal temp : a) {System.out.print(temp + " "+"\n"); }
                System.out.print(" - by Weight Comparator");
                System.out.println();

            } else if (userInput.equals("3")) {
                Arrays.sort(a, new compareByName());
                for (Animal temp : a) {
                    System.out.print(temp + " "+"\n");
                }
                System.out.print(" - by Name Comparator");
                System.out.println();

            } else if (userInput.equals("4")) {
                Arrays.sort(a, new compareByHeight());
                for (Animal temp : a) {
                    System.out.print(temp + " "+"\n");
                }
                System.out.print(" - by Height Comparator");
                System.out.println();

            } else {
                    Arrays.sort(a, new compareBySpecies());
                    for (Animal temp : a) {
                        System.out.print(temp + " "+"\n");
                    }
                    System.out.print(" - by Species Comparator");
                    System.out.println();

                }
            }
        }

    class compareByWeight implements Comparator{
        public int compare(Object obj1, Object obj2){
        String weig = Integer.toString(((Animal)obj1).weight);
            return ((Animal)obj1).weight - ((Animal)obj2).weight;
        }
    }
    class compareByName implements Comparator{
        public int compare(Object obj1, Object obj2){
            return ((Animal)obj1).name.compareTo(((Animal)obj2).name);
        }
    }
    class compareByHeight implements Comparator{
        public int compare(Object obj1, Object obj2){
            String heig = Integer.toString(((Animal)obj1).height);
            return ((Animal)obj1).height - ((Animal)obj2).height;
        }
    }
    class compareBySpecies implements Comparator{
    public int compare(Object obj1, Object obj2){
        return ((Animal)obj1).species.compareTo(((Animal)obj2).species);
    }
}

   class Animal {
       String species;
       int weight;
       String name;
       int height;
       //     String userInput;

       Animal(String species, int weight, String name, int height) {
           this.species = species;
           this.weight = weight;
           this.name = name;
           this.height = height;
           // this.userInput = userInput;
       }

       @Override
       public String toString() {
           return "Animal{" +
                   "species='" + species +
                   ", weight=" + weight +
                   ", name='" + name +
                   ", height=" + height +
                   '}';
       }
   }


