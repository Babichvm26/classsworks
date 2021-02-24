package lesson_99;

public class Main {
    public static void main(String[] args) {


        Figure f1 = new Figure();
        Figure f2 = new Figure();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Formula fo1 = new Formula();
        Formula fo2 = new Formula();

        Formula[] r = {fo1, fo2, r1};
        Figure[] f = {f1, f2, r2.makeFigure()};

        for(Formula temp: r) {
            temp.process();
        }
        for(Figure temp: f) {
            temp.process();

        }
    }
}

