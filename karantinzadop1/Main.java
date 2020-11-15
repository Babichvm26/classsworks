package karantinzadop1;

public class Main {
    public static int generateRandom(int min, int max) {
        return (int) Math.round(min + (Math.random() * (max - min)));
    }
    public static void main(String[] args) {
        System.out.println("Задача 1. Создать массив (размер 8) случайными числами в диапазоне [5, 30].\n" +
                "Перевернуть массив по главней диаюнали.");
        int i,j;
        int[][] array = new int[8][8];
        int[][] array2 = new int[8][8];
        for ( i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = generateRandom(5, 30);
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");


//Создание перевёрнутого массива по главной диагонали
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array2[j][i]=array[i][j];
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }


//====================================
    }
}
