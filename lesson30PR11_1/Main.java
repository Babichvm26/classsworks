package lesson30PR11_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("В масиві з елементами, які не повторюються, прибрати максимум та мінімум");
//
        int i,n1,i1, n2, i2, k;
        int[] numbers = {45, 2 , 6, 7, 21, 25, 24, 5, 3, 9, 28, 34, 56, 36};
        String min,max;
//

// определяем минимум
        n1=1000;  i1=0;
        System.out.println("n1="+n1);
        k=numbers.length;
        System.out.println("k="+k);

        for (i = 0; i < k; i++) {
//         System.out.println("i="+i +"    n1="+n1+ "   numbers[i]="+numbers[i]);
            if (n1 >= numbers[i]) {
                n1 = numbers[i];  i1=i;
//                min="min";

            }
        }
        System.out.println("Минимальный елемент массива = " + n1 +"   индекс i1="+i1);
//
// определяем максимум
        n2=-1000; i2=0;
        for (i = 0; i < k; i++) {
            if (n2 <= numbers[i]) {
                n2 = numbers[i];   i2=i;
//                max="max";
            }
        }
        System.out.println("Максимальный елемент массива = " + n2 +"   индекс i2="+i2);
 //
        for (i = 0; i < k; i++) {
          if (i!=i1 & i!=i2) {System.out.println(numbers[i]);}
//          if (i==i1){System.out.println("min");}
//          if (i==i2){System.out.println("max");}
          if (i==i1){System.out.println(" ");}
          if (i==i2){System.out.println(" ");}
        }
//
    }
}
