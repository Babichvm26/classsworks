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
 //
        int[] otr1 = new int[iotr];
        int[] pol2 = new int[ipol];
//
        for (i = 0; i < iotr; i++) {
            otr1[i]=otr[i];
            System.out.println(otr1[i]);
        }

        for (i = 0; i < ipol; i++) {
            pol2[i] = pol[i];
            System.out.println(pol[i]);
        }
//
    }
}
