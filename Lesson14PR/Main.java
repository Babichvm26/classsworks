package Lesson14PR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 2 == 0) {
            System.out.println("Число " + n + " четное");
        } else {
            System.out.println("Число " + n + " нечетное");

        }


    }
}
