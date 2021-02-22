package lesson95;
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.weight=5;
        Cat.legs = 3;
        Cat.Body catBody = new Cat.Body();
        //Body.legs   //compile error
        catBody.changeLegs();
        System.out.println(Cat.legs);

        Cat.Head catHead = new Cat().new Head();
        Cat.Head catHead2 = myCat.new Head();

        myCat.getWeight();























    }
}
