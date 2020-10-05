package lesson20PR6;

public class Main {
    public static void main(String[] args) {
        int i, n1, n2, a1, a2;
        double b1, b2;

// пример 3
//
        System.out.println("3 пример");
        n1 = 20;
        n2 = 4;
        for (i = n1; i>= n2; i--) {
            a1 = i / 2;
            a2 = i / 2;
            b1 = (double) i / 2;
            b2 = (double) i / 2;
//
            if (a1 == b1 & a2 == b2) {
                System.out.println("Деление на 2 " + i);
            }
        }


       System.out.println("");
       System.out.println("");
       System.out.println("4 пример");
       int j;
       for (i = 5; i<= 10; i++) {
            j = 14 - i;
           if (j == 4) {System.out.println("i =" + i);}
           else {System.out.println("i =" + i + "     j =" + j);}
               }
        System.out.println("");
        System.out.println("");



        System.out.println("5 пример");

        int s;
        double ss;
       a1=10;  a2=20;
            s=0;
        for (i = a1; i<= a2; i++) { s=s+i;}
         ss= (double) s/(a2-a1);
        System.out.println("Сумма =" + s);
        System.out.println("середнє арифметичне =" + ss);

// шапка
           }
       }


