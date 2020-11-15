package karantinzad1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Заполнить двумерній массив по схеме, используя формулу");
        int[][] array = {{0,-1,-2,-3}, {1,0,-1,-2},{1,2,0,1},{1,2,3,0}};


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
