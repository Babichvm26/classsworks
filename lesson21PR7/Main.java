package lesson21PR7;

public class Main {
    public static void main(String[] args) {
        int i, k, n1, n2, a1, a2;
        double b1, b2;
        int d1, d2;
//     k=10;  i=4;
/*
   System.out.println("1 пример");
   for (i=10; i>=4; i--) {
       System.out.println(i);
   }
        System.out.println("");
        System.out.println("");

        System.out.println("2 пример");
       for (i=5; i<=19; i++) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("");
*/
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
    }
}
