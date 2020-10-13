package lesson20PR6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, n1, n2, a2;
        double b1, b2;
        double a1;

// пример 3
//
        System.out.println("3 пример");
        n1 = 20;
        n2 = 4;
        for (i = n1; i>= n2; i--) {
//            a1 = i / 2;
//            b1 = (double) i / 2;
//            if (a1 == b1){
//                System.out.println("Деление на 2 " + i);
//            }
            a1 = i / 2;
            a1 = i-a1*2;
            if(a1==0) { System.out.println("Деление на 2 " + i);}
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
        System.out.println("");
        System.out.println("");

        int a7, a11;
        System.out.println("6 пример");
        a7 = 7;
        a11 = 11;
        for (i = 1; i <= 100; i++) {
//            a1 = i / a7;
//            a2 = i / a11;
//            b1 = (double) i / a7;
//            b2 = (double) i / a11;
            a1 = i / a7;
            a1 = i-a1*a7;
            if (a1==0) System.out.println("Деление на 7  " + i);
            a1 = i / a11;
            a1 = i-a1*a11;
            if (a1 == 0) System.out.println("Деление на 11 " + i);
        }


        System.out.println("");
        System.out.println("");
        System.out.println("7 пример");
        int input=1000;
        boolean g = true;
        for (int P = 2; P <= input; P++) {
            for (i = 2; i < P; i++) {
                if (P % i  == 0) {
                    g = false;
                    break;
                }
            }
            if (g) System.out.println(P);
            else g = true;
        }


        System.out.println("");
        System.out.println("");
        System.out.println("8 пример");
        double m1,m2,m3;
        m1=0;
        System.out.println(m1 + "число Фибоначчи  " + m1);
        m2=1;
        System.out.println(m2 +"число Фибоначчи  " + m2);
        for (i = 3; i <= 100; i++) {
            m3 = m1 + m2;
            System.out.println(i + " число Фибоначчи  " + m3);
            m1 = m2;
            m2 = m3;
        }




// шапка

           }
       }


