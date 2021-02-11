package lesson93_1;

public class Animal implements Comparable {
    String species;
    int weight;
    String name1;
    int height1;
    Animal(String species, int weight, String name1, int height1){
        this.species = species; this.weight = weight; this.name1 = name1; this.height1 = height1;
    }

    public String toString(){
        return this.species + " " + this.weight + " " + this.name1 + " " + this.height1;
    }

    public int compareTo(Object o){  //модель-скорость-цена-цвет.
        int temp = this.species.compareTo(((Animal) o).species);
        if (temp == 0){
            temp = this.weight - ((Animal) o).weight;
            if (temp == 0) {
                temp = this.name1.compareTo(((Animal) o).name1);
                if (temp == 0){
                    temp = this.height1 - ((Animal) o).height1;
                    return temp;
                }else{
                    return temp;
                }
            }else{
                return temp;
            }
        } else {
            return temp;
        }
    }






}
