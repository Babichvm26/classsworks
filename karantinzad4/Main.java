package karantinzad4;
import java.util.Arrays;
public class Main {

    public static int generateRandom(int min, int max) {
        return (int) Math.round(min + (Math.random() * (max - min)));
    }

    public static void main(String[] args) {
        System.out.println("Задача 4. Заполнить двумерный массив случайным образом,"+
                "Найти сумму элементов, стоящих на четных местах каждой строки.");
        int i,j;
        int[][] array = new int[4][7];
//
        for ( i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = generateRandom(-100, 100);
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
//
         int j2;
         j2=0;
         int sum;
        for (i = 0; i < array.length; i++) {
            sum=0;
           for (j = 1; j < array[i].length; j++) {
               if(j % 2 == 0){j2=j; sum=sum+array[i][j];
              System.out.println("i="+i+"   j2 ="+j2);}

            }
            System.out.println("sum="+sum);
        }



//=======================
  }
}
