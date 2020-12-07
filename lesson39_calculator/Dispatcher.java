package lesson39_calculator;

public class Dispatcher {
    public static void main(String[] args) {

        Model m1 = new Model( 32, 4);
        System.out.println("x = " + m1.x +"y = " + m1.y);

        //   m1.x = 55;
        // m1.y = 6;
        //  m2.x = -21;
        //  m2.y = 37;

        Controller c = new Controller();

        int sum = c.add(m1.x,m1.y);

        int substract = c.substract(m1.x,m1.y);

        int multiply = c.multiply(m1.x,m1.y);

        double div = c.div(m1.x,m1.y);


        View v = new View();

        System.out.println("Печать m1.x + m1.y");
        v.displayInt(sum);

        System.out.println("Печать m1.x - m1.y");
        v.displayInt(substract);

        System.out.println("Печать m1.x * m1.y");
        v.displayInt(multiply);

        System.out.println("Печать m1.x / m1.y");
        v.displayDouble(div);


    }
}



