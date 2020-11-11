package Lesson4OnQuarantineRostyk;

import java.util.Arrays;

public class Main2 {
    public static int generateRandom(int min, int max){
        return (int) Math.round(min + (Math.random() * (max - min)));
    }

    public static void main(String[] args) {
        int[][] doubleMassive = new int[15][10];

        int min = 0;
        int max = 500;

        for (int i = 0; i < doubleMassive.length; i++) {
            for (int j = 0; j < doubleMassive[i].length; j++) {
                if(j % 2 != 0){
                    doubleMassive[i][j] = generateRandom(min, max);
                }
            }
        }

        for (int[] oneCellFromMassive:
             doubleMassive) {
            System.out.println(Arrays.toString(oneCellFromMassive));
        }
    }
}
