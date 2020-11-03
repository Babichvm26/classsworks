package lesson30PR11_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Масив поділити на два масива: додатних та від'ємних чисел");
//
        int i, k,ipol,iotr;
        int[] numbers = {-45, 2 , -6, 7, -21, 25, -24, 5, -3, 9, -28, 34, -56, 36};
        int[] pol = new int[numbers.length];
        int[] otr = new int[numbers.length];
//
        k=numbers.length;
        ipol=0; iotr=0;
        for (i = 0; i < k; i++) {
          if (numbers[i] < 0 ) {otr[iotr]=numbers[i]; iotr=iotr+1;}
          if (numbers[i] > 0 ) {pol[ipol]=numbers[i]; ipol=ipol+1;}
        }
        System.out.println("Печать массива отрицательных чисел");
        for (i = 0; i < iotr; i++) {
            System.out.println(otr[i]);
        }
        System.out.println("Печать массива положительных чисел");
        for (i = 0; i < ipol; i++) {
            System.out.println(pol[i]);
        }

//
    }
}
