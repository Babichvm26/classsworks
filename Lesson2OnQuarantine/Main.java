package Lesson2OnQuarantine;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] randomNumbers = new int[30];
        int min = -100;
        int max = 100;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] =(int) Math.floor(Math.random() * (max - min)) + min;
        }

        System.out.println(Arrays.toString(randomNumbers));


        int amountOfAllPositive = 0;
        for (int i = 0; i < randomNumbers.length; i++) {

            if(randomNumbers[i] >0){
                amountOfAllPositive++;
            }
        }
        
        int[] positiveList = new int[amountOfAllPositive];
        int numbersOfTick = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i] >0){
                positiveList[numbersOfTick] = randomNumbers[i];
                numbersOfTick++;
            }


        }

        System.out.println(Arrays.toString(positiveList));
    }
}
