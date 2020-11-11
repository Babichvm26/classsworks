package Lesson4OnQuarantineRostyk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int[][] doubleMasive = new int[4][4];

            for (int i = 0; i < doubleMasive.length; i++) {
                int tick = 1;
                for (int j = 0; j < doubleMasive[i].length; j++) {
                    if(i <j){
                        doubleMasive[i][j] = -tick;
                        tick=tick+1;
                    }
                    if(i >j){
                        doubleMasive[i][j] = j+1;
                    }
                }
            }
            for (int[] cellFromBigMassive:
                    doubleMasive) {
                System.out.println(Arrays.toString(cellFromBigMassive));
            }
        }

    }
