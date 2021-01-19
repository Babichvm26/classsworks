package lesson_73;

public class Chek {
    String name;
    int portion;
    double price;
    Chek(String name, int portion, double price){
        this.name = name;
        this.portion = portion;
        this.price = price;
    }

    public Chek() {
   }

    public String toString (){
        return this.name + " " + this.portion + " " + this.price;
    }

}
