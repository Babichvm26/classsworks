package karantinzad8;

public class Main {
    public static int generateRandom(int min, int max) {
        return (int) Math.round(min + (Math.random() * (max - min)));
    }
    public static void main(String[] args) {
        System.out.println("Задача 8. Заполнить массив (размер 20) случайными числами в диапазоне [30,40] \n" +
                "Создать одномерный массив из сумм построчных массивов.");
        int i,j;
        int[][] array = new int[20][20];
        int[] array1 = new int[20];
        for ( i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = generateRandom(30, 40);
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
//формирование одномерного массива
        for (i = 0; i < array.length; i++) {
            int sum=0;
            for (j = 0; j < array[i].length; j++) {
              sum=sum+array[i][j];
            }
            array1[i]=sum;
            System.out.print("i="+i+"  sum="+ sum+"\n");
        }


//================================
    }
}


