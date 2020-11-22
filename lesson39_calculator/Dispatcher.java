package lesson39_calculator;

public class Dispatcher {
    public static void main(String[] args) {

        Model m = new Model(8,-2);
        Model m2 = new Model();
        int sum = Controller.add(m.x,m.y);
        int dif = Controller.subtract(8,4);
        View.display(sum);



        Model m1= new Model();
        m.x = 4;
        m.y = 8;
        Model m2 = new Model();
        m2.x = -3;
        m2.y = 6;
        Controller calc = new Controller();
        int result = calc.add (m.x,m.y);
        System.out.println(result);
        View v = new View();
        v.display(result);
        double к2 = calc.divide(m2.x,m2.y);
        v.displayDouble(result);
    }
}
