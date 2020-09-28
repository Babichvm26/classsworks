package Lesson14PR5Num3;
public class Main {
    public static void main(String[] args) {
        double a = 14d;
        double b = 10d;
        double c = 8d;
        double d = Math.pow(b, 2) - 4*a*c;
        if (d > 0) {
            double x = -b + Math.sqrt(Math.pow(b, 2)- 4 * a * c);
            double y = -b - Math.sqrt(Math.pow(b, 2)- 4 * a * c);
            System.out.println(x);
            System.out.println(y);
        } else if (d == 0) {
            double x = -b / 2 * a;
            System.out.println(x);
        } else {
            System.out.println("Корней нет");
        }


    }
}
