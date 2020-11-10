package Karantin3zad;

import java.util.Arrays;

public class Main {
    public static int generateRandom(int min, int max){
        return (int) Math.round(min + (Math.random() * (max - min)));
    }
    public static void main(String[] args) {

        int i ;
        int[] rab1 = new int[21];
        int[] rab2 = new int[30];
        int[] rab3 = new int[50];
        int min=-45;
        int max=100;
        String  str = new String();
//
       System.out.println("Створити один масив з 20 чисел, заповнений випадковим способом із діапазону [-45;100].");
       for ( i = 0; i < 20; i++) {
        rab1[i] = generateRandom(-45, 100);
//       System.out.println("rab 1[i]= "+rab1[i]);
       }
        str = "";
        for ( i = 0; i < 20; i++) {
        str=str+"  "+Integer.toString(rab1[i]);
        }
        System.out.println("str = "+str);
//
        System.out.println("Створити другий масив з 30 чисел, заповнений випадковим способом із діапазону [-100;200]");
        for ( i = 0; i < 30; i++) {
            rab2[i] = generateRandom(-45, 100);
//       System.out.println("rab2[i]= "+rab2[i]);
        }
         min=-100;
         max=200;
        str = "";
        for ( i = 0; i < 30; i++) {
            str=str+"  "+Integer.toString(rab2[i]);
        }
        System.out.println("str = "+str);
//
      System.out.println("Створити третій масив із парних чисел двох масивів");
      // Nk - кол. парных чисел
      int Nk=0;
      int k=0;
      int c1;
//
      //проверка массива rab1[i]
        while (k<20) {
            if (rab1[k]==0) break;
            c1 = rab1[k] / 2;
//            System.out.println("k=" +k+ "  c1= "+ c1);
            c1 = rab1[k]-c1*2;
            if (c1 == 0) {
                c1=0;
                rab3[Nk]=rab1[k];
                Nk=Nk+1;
//                System.out.println("k=" +k+ "  rab1[k]="+rab1[k]+ "  делится на 2"+ "   Nk="+ Nk);
            }
            k++;
        }
//        System.out.println(" кількість чисел при діленні на 2  Nk=" +Nk);
//        System.out.println("=============");
        //
        //проверка массива rab2[i]
        k=0;
        while (k<30) {
            if (rab2[k]==0) break;
            c1 = rab2[k] / 2;
//            System.out.println("k=" +k+ "  c1= "+ c1);
            c1 = rab2[k]-c1*2;
            if (c1 == 0) {
                c1=0;
                rab3[Nk]=rab2[k];
                Nk=Nk+1;
//                System.out.println("k=" +k+ "  rab2[k]="+rab2[k]+ "  делится на 2"+ "   Nk="+ Nk);
            }
            k++;
        }
        System.out.println(" кількість чисел при діленні на 2  Nk=" +Nk);
        str = "";
        for ( i = 0; i < Nk; i++) {
            str=str+"  "+Integer.toString(rab3[i]);
        }
        System.out.println("str = "+str);



//================================================================
    }
}
