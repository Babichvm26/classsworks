package Lesson4OnQuarantineRostyk;

import java.util.Arrays;

public class Main3 {
    public static int generateRandom(int min, int max){
        return (int) Math.round(min + (Math.random() * (max - min)));
    }
    public static void main(String[] args) {

        int min = -30;
        int max = 40;
        int[][] doubleMassive = new int[20][4];

        for (int i = 0; i < doubleMassive.length; i++) {
            for (int j = 0; j < doubleMassive[i].length; j++) {
                doubleMassive[i][j]=generateRandom(min, max);
            }
        }

        int[] oneLineMassive = new int[doubleMassive.length];
        for (int i = 0; i < doubleMassive.length; i++) {
            int sumOfValues = 0;
            for (int j = 0; j < doubleMassive[j].length; j++) {
                sumOfValues+=doubleMassive[i][j];
            }
            oneLineMassive[i] = sumOfValues;
        }
        for (int[] cellFromMasive:
             doubleMassive) {
            System.out.println(Arrays.toString(cellFromMasive));
        }
        System.out.println(Arrays.toString(oneLineMassive));
    }
}
