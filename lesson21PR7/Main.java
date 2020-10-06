package lesson21PR7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j , k, n1, n2, a1, a2;
        double b1, b2;
        int d1, d2;


      //     k=10;  i=4;
        System.out.println("1 пример");
        for (i = 10; i >= 4; i--) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("");
//----------------------------------
        System.out.println("2 пример");
        for (i = 5; i <= 19; i++) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("3 пример");
        k = 1000;
        n1 = 11;
        n2 = 3;
        for (i = 1; i <= k; i++) {
            a1 = i / n1;
            a2 = i / n2;
            b1 = (double) i / n1;
            b2 = (double) i / n2;
//
            if (a1 == b1 & a2 == b2) {
                System.out.println("Деление на 11 и 3   " + i);
            }
        }

//---------------------------------------------
        System.out.println("");
        System.out.println("");
        System.out.println("4 пример");
        int nk=1000;
        System.out.println(" введите k");
        Scanner k1 = new Scanner(System.in);
        k = k1.nextInt();
        for (i = 1; i <= nk; i++) {
            a1 = i / k;
            b1 = (double) i / k;
            if (a1 == b1) System.out.println(i + " делится на k ");
        }
//
        System.out.println(" введите i");
        Scanner k2 = new Scanner(System.in);
        i = k2.nextInt();
        for (j = 1; j <= nk; j++) {
            a1 = j / i;
            b1 = (double) j / i;
            if (a1 == b1) System.out.println(j + " делится на i ");
        }

//---------------------------------------
                System.out.println("");
                System.out.println("");
                System.out.println("5 пример");
        System.out.println(" введите ");
                Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                boolean g = true;
                for (int P = 2; P <= n; P++) {
                    for (i = 2; i < P; i++) {
                        if (P % i == 0) {
                            g = false;
                            break;
                        }
                    }
                    if (g) System.out.println(P);
                    else g = true;
                }

//==========================
            }
        }
