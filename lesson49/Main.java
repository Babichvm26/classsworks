package lesson49;
import java.util.Calendar;
import  java.util.Date;
import  java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вывести месяц своего дня рождения в 2017");

        Date d = new Date();
        GregorianCalendar gc = new GregorianCalendar(2017, 4, 24);
        System.out.println("Год рождения: "+gc.get(Calendar.YEAR));
        System.out.println("Месяц рождения: "+gc.get(Calendar.MONTH));
        System.out.println("День месяца: "+gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("День недели по американскому календарю : "+gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("");
        System.out.println("Вывод по нашему календарю, а не по американскому (с понедельника). ");
        int dned=gc.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("День недели не по американскому календарю : "+dned);





    }
}