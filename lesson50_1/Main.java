package lesson50_1;
import java.util.Calendar;
import  java.util.Date;
import  java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args) {
        System.out.println("Вывести день недели для своего дня рождения +- 5лет.");
//
        int jc5;
        int dweek;
//
        Date d = new Date();
        GregorianCalendar gc = new GregorianCalendar(2005, 4, 24);
        int jc=gc.get(Calendar.YEAR);
        int mc=gc.get(Calendar.MONTH);
        int dc=gc.get(Calendar.DAY_OF_MONTH);
        System.out.println("Дата рождения: " +dc+"."+mc+"."+jc);
        jc5=jc+5;
        gc.set(Calendar.YEAR, jc5);
        dweek=gc.get(Calendar.DAY_OF_WEEK);
        System.out.println("День недели (+5 лет): "+dweek);
//
        jc5=jc-5;
        gc.set(Calendar.YEAR, jc5);
        dweek=gc.get(Calendar.DAY_OF_WEEK);
        System.out.println("День недели (-5 лет): "+dweek);
//
//
        System.out.println("");
        System.out.println("");
        System.out.println("Посчитать сколько полных недель было между началом и концом первого карантина");
        GregorianCalendar gcn = new GregorianCalendar(2020, 3, 25);
        GregorianCalendar gck = new GregorianCalendar(2020, 5, 25);
//
// массив дней в месяцах года
//                                 1  2  3  4  5  6  7  8  9  10 11 12
        int [] dmg = new int[ ]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int m, da,da1;
// первый месяц карантина
        int year=gcn.YEAR;
        System.out.println("Год начала карантина year ="+year);
        int month=gcn.MONTH+1;
        System.out.println("Месяц начала карантина month="+month);
        int c1 = year / 2;
        c1 = year-c1*2;
        if (c1 == 0) {dmg[2]=dmg[2]+1;}
        da=dmg[month];  // кол дней в 1 месяце карантина
//
// кол дней до начала карантина
        int dt=gcn.get(Calendar.DAY_OF_MONTH);
// 3 месяц
        int sumd=da-dt+1;
        System.out.println("Кол. дней карантина в первом месяце sumd= "+sumd);
//
// последний месяц карантина
        int monthk=gck.get(Calendar.MONTH);
        System.out.println("Месяц окончания карантина= "+monthk);
//
        dt=gck.get(Calendar.DAY_OF_MONTH);
        sumd=sumd+dt;
        System.out.println("количество дней карантина в 1 + последнем месяце = "+sumd);
// определение дней во внутреннем диапазоне месяцев
        int n1=month+1;  //второй месяц карантина
        int n2=monthk-1; //предпоследний месяц карантина
        System.out.println("n1="+n1+"  n2="+n2);
        int i;
        for (i=n1; i <= n2; i++){ sumd =sumd+dmg[i]; };
// кол. недель карантина
        int kned=sumd/7;
        System.out.println("Количество недель карантина= "+kned);
//==========================================
    }
}
