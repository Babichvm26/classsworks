package Lesson1OnQuarantine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] randomNumbers = new int[15];
        int min = 154;
        int max = 186;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] =(int) Math.floor(Math.random() * (max - min)) + min;
        }

        int[] numbersList = randomNumbers;
        int[] numbersListSorted = numbersList;

        int minimalValue = numbersListSorted[0];

        int maximalValue = numbersListSorted[numbersListSorted.length-1];

        int indexOfMinimalValue = 0;
        int indexOfMaximalValue = 0;
        System.out.println(Arrays.toString(randomNumbers));
        Arrays.sort(numbersListSorted);

        System.out.println("Минимальный: "+ minimalValue + "\nМаксимальный: " + maximalValue);
        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i] == minimalValue){
                indexOfMinimalValue = i;
            }
            if(randomNumbers[i] == maximalValue){
                indexOfMaximalValue = i;
            }
        }
        System.out.println("Максимальный индекс: " + indexOfMaximalValue);
        System.out.println("Минимальный индекс: " + indexOfMinimalValue);


        int sumOfH = 0;

        for (int ValueInList:
             randomNumbers) {
            sumOfH+= ValueInList;
        }

        System.out.println("Средний рост = " + sumOfH/randomNumbers.length);
        System.out.println("Сумма = " + sumOfH);

    }

}
