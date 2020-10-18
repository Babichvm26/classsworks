package lesson21PR7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j , k, n1, n2, a1, a2;
        double b1, b2;
        int d1, d2;
/*
      //     k=10;  i=4;
        System.out.println("1 пример");
//        for (i = 10; i >= 4; i--) {
//            System.out.println(i);
//        }
        i=10;
        while (i>=4) {
            System.out.println(i);
        i--;
        }

        System.out.println("");
        System.out.println("");
//----------------------------------
        System.out.println("2 пример");
//        for (i = 5; i <= 19; i++) {
//            System.out.println(i);
//        }
        i=5;
        while (i<=19) {
            System.out.println(i);
            i++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("3 пример");
        k = 1000;
        n1 = 11;
        n2 = 3;
//        for (i = 1; i <= k; i++) {
//            a1 = i / n1;
//            a2 = i / n2;
//            b1 = (double) i / n1;
//            b2 = (double) i / n2;
//
//            if (a1 == b1 & a2 == b2) {
//                System.out.println("Деление на 11 и 3   " + i);
//            }
            i=1;
        while (i<=k) {
            a1 = i / n1;
            a2 = i / n2;
            b1 = (double) i / n1;
            b2 = (double) i / n2;
//



            if (a1 == b1 & a2 == b2) {
                System.out.println("Деление на 11 и 3   " + i);
            }
            i++;
        }
*/
//---------------------------------------------
        System.out.println("");
        System.out.println("");
        System.out.println("4 пример");
        int nk=1000;
        System.out.println(" введите k");
        Scanner k1 = new Scanner(System.in);
        k = k1.nextInt();
//      for (i = 1; i <= nk; i++) {
//            a1 = i / k;
//            b1 = (double) i / k;
//            if (a1 == b1) System.out.println(i + " делится на k ");
//        }
        int c1;  int Nk=0;
        j=1;
        while (j<=nk) {
//            c1 = j % k;    ??????????????
            c1 = j / k;
            System.out.println("j=" +j+ "  k=" +k+ "  c1= "+ c1);

            c1 = j-c1*k;
            if (c1 == 0) {
                Nk=Nk+1;
                System.out.println(j + " делится на k ");
            }
            j++;
        }
        System.out.println(" кількість чисел при діленні на k  Nk=" +Nk);

//
/*

        System.out.println(" введите i");
        Scanner k2 = new Scanner(System.in);
        i = k2.nextInt();
//        for (j = 1; j <= nk; j++) {
//            a1 = j / i;
//            b1 = (double) j / i;
//            if (a1 == b1) System.out.println(j + " делится на i ");
//        }
        j=1; int Ni=0;
        while (j<=nk) {
            c1 = j / i;
            c1 = j-c1*i;
            if (c1 == 0) {
                Ni=Ni+1;
                System.out.println(j + " делится на i ");
            }
            j++;
        }
        System.out.println(" кількість чисел при діленні на i  Ni=" +Ni);

//---------------------------------------

                System.out.println("");
                System.out.println("");
                System.out.println("5 пример");
        System.out.println(" введите k  ");
                Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                boolean g = true;

//                for (int P = 2; P <= n; P++) {
//                    for (i = 2; i < P; i++) {
//                      if (P % i == 0) {
//                            g = false;
//                            break;
//                        }
//                    }
//                    if (g) System.out.println(P);
//                    else g = true;
//                }


        System.out.println(" введите k  ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean g = true;
        int P=2;
        while (P<=n) {
            i=2;
            while (i<P) {
                if (P % i == 0) {
                    g = false;
                    break;
                }
                i++;
            }
            if (g) System.out.println(P);
            else g = true;
            P++;
        }
*/
//==========================
            }
        }
