package lesson40;

public class Var1 {
    public static void main(String[] args) {


    Model m1 = new Model();

    m1.x = 300000;  //  m/c
    m1.y = 5; // сек
        System.out.println("Скорость сета: " + m1.x + " [м/с]          Время до наблюдения молнии: " +m1.y+" [c]");
        System.out.println(" Расчет расстояния до места вспышки молнии.");

   Controller c = new Controller();

   int multiply = c.multiply(m1.x,m1.y);

   View v = new View();

        v.displayInt(multiply) ;



//====================================
    }
}
