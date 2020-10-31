package lesson26PR9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поиск элемента в массиве и определение количества повторов элемента");
        int j;
        int n1;
        int[] numbers = {2,6,7,21,25,42,23,6,21,2,7,42,25,23,21,2,25};
        int[] rab = new int[numbers.length];
// копирование массива
        for (int i = 0; i < numbers.length; i++) {
            rab[i] = numbers[i];
//          System.out.println("i=" + i + "rab[i]=" + rab[i]);
        }
// кол возвратов по повторению
        for (j = 0; j <= rab.length; j++) {
            int ipov = 0;
            n1 = rab[j];
            if (n1==0) break;
            for (int i = 0; i < rab.length; i++) {
                if (n1 == rab[i]) {
                    ipov = ipov + 1;
                    rab[i] = 0;
                }
//            break;
            }
            System.out.println("Кол повторений числа n1=" + n1 + "    равно ipov=" + ipov);
        }
        }
}
