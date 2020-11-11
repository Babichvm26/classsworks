package Lesson2OnQuarantine;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[30];
        int min = -70;
        int max = 90;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] =(int) Math.floor(Math.random() * (max - min)) + min;
        }


        int sumOfAllElements = 0;
        for (int valueFromList:
             randomNumbers) {
            sumOfAllElements= sumOfAllElements + valueFromList;
        }

        int middleArithmetic = sumOfAllElements/randomNumbers.length;

        int amountBiggerThanMiddleArithmetic = 0;


        for (int valueFromList:
             randomNumbers) {

            if (valueFromList > middleArithmetic){
                amountBiggerThanMiddleArithmetic++;
            }

        }


        int[] listOfBiggerThanMiddleArithmetic = new int[amountBiggerThanMiddleArithmetic];

        int tickOfIteration = 0;
        for (int valueFromList:
             randomNumbers) {
            if(valueFromList > middleArithmetic){
                listOfBiggerThanMiddleArithmetic[tickOfIteration] = valueFromList;
                tickOfIteration++;
            }
        }

        System.out.println("Получили массив: " + Arrays.toString(randomNumbers));

        System.out.println("Средн. статс: " + middleArithmetic);
        System.out.println("Больше среднестатистического:" + Arrays.toString(listOfBiggerThanMiddleArithmetic));


    }
}
