package lesson_99;

public class Rectangle extends Formula {
    @Override
    void process() {
        super.process();
        System.out.println("I'm Rectangle...");
    }

    Figure makeFigure() {
        return new Figure () {
            @Override
            void process() {
                super.process();
                System.out.println("I'm Rectangle...");
            }
        };
    }
}