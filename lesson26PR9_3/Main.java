package lesson26PR9_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Определение ср. ариф. элементов массива и количества элементов, которые больше ср. ариф");
        int[] numbers = {45, 2, 6, 7, 21, 25, 24, 5, 3, 9, 28, 34, 56, 36};
//Определение ср. ариф. элементов массива
int sr_arif,k,i;
        k=numbers.length;   sr_arif=0;
        for ( i = 0; i < k; i++) {
            sr_arif = sr_arif +  numbers[i];
        }
        sr_arif = sr_arif/k;
        System.out.println("количество элементов = " +k);
        System.out.println("ср. ариф. = " + sr_arif);

// количествo элементов, которые больше ср. ариф
        int kel = 0;
        for ( i=0; i<k; i++) {
          if  (sr_arif < numbers[i]) kel=kel+1;
        }
        System.out.println("количество элементов, которые больше ср. ариф = " + kel);
//===================
    }
}
